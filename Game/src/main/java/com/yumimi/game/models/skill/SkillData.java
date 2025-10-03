package com.yumimi.game.models.skill;

import com.yumimi.game.battle.Combatant;
import com.yumimi.game.util.enums.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public abstract class SkillData implements Skill {

    private String name;
    private String description;
    private Rarity rarity;
    private int point;
    private boolean equipped = false;
    private int manaCost;
    private SkillType skillType;
    private TypeDamage typeDamage;
    private TypeUseSkill typeUseSkill;

    private int heal;
    private int mana;
    private int armour;
    private int damage;
    private int stunDuration;

    private SupType supType;

    @Override
    public String toString() {
        return "|||" + name + "||| " + description + " " + rarity + " {" + manaCost + "} [" + point + "]";
    }

    @Override
    public boolean equals(Object a) {
        if (this == a) return true;
        if (!(a instanceof Skill other)) return false;
        return name != null && name.equalsIgnoreCase(other.getName());
    }

    @Override
    public int hashCode() {
        return name == null ? 0 : name.toLowerCase().hashCode();
    }

    @Override
    public void use(Combatant caster, Combatant target){
        Random random = new Random();

        int cost = calculateManaCost(caster);

        if (caster.getMana() < cost) {
            caster.getCombatLog().add(caster.getName() + " пытается использовать " + name + " но недостаточно маны.");
            return;
        } else caster.setMana(caster.getMana() - cost);

        double lastHit = caster.getHitChance() * (1 - target.getEvasion());

        switch (skillType){
            case DAMAGE ->{
                if (random.nextDouble() > lastHit) {
                    target.getCombatLog().add(target.getName() + " уклонился от " + name);
                    return;
                }

                boolean isCrit = random.nextDouble() < caster.getCritChance();

                int lastDamage = getDamage(caster, target, isCrit);
                if (random.nextDouble() < target.getBlockChance()) {
                    lastDamage /= 2;
                    target.getCombatLog().add(target.getName() + " заблокировал удар, урон уменьшен" + damage);
                }

                double lifeSteal = lastDamage * caster.getLifeSteal();
                caster.setHp((int) (caster.getHp() + lifeSteal));

                if (lastDamage <= 0) {
                    target.getCombatLog().add("Не хватает урона");
                    return;
                }

                if (caster.getRegenMana() > 0) {
                    caster.setMana((int) (caster.getMana() + caster.getRegenMana()));
                }

                if (caster.getRegenHp() > 0) {
                    caster.setHp((int) (caster.getHp() + caster.getRegenHp()));
                }

                target.takeDamage(lastDamage);
                target.getCombatLog().add("Нанесен урон в размере" + lastDamage);


            }
            case HEALING ->{
                switch (supType) {
                    case HP -> {
                        if (!caster.isDead()) {
                            int newHp = caster.getHp() + heal;
                            caster.setHp(newHp);
                            caster.getCombatLog().add("Восполнено " + heal + " здоровья");
                        } else {
                            caster.getCombatLog().add("Игрок мертв");
                        }
                    }
                    case MANA -> {
                        if (!caster.isDead()) {
                            int newMana = caster.getMana() + mana;
                            caster.setMana(newMana);
                            caster.getCombatLog().add("Восполнено " + mana + " маны");
                        } else {
                            caster.getCombatLog().add("Игрок мертв");
                        }
                    }
                }
            }
            case DEFENSIVE ->{
                if (!caster.isDead()){
                    int newArmor = caster.getArmour() + armour;
                    caster.setArmour(newArmor);
                    target.getCombatLog().add("Набрано " + armour + " брони");
                }else target.getCombatLog().add("Игрое мертв");
            }
            case STUN -> {

                if (random.nextDouble() > lastHit) {
                    caster.getCombatLog().add(target.getName() + " уклонился от " + name);
                    return;
                }

                target.setStunned(true);
                target.setStunDuration(stunDuration);

                caster.getCombatLog().add(caster.getName() + " использует " + name +
                    " и оглушает " + target.getName() + " на " + stunDuration + " ход(ов)");
            }

        }
    }

    private int getDamage(Combatant caster, Combatant target, boolean isCrit) {
        int hit = caster.getDamage() + damage;
        switch (typeDamage) {
            case Magic -> {
                switch (caster.getTypeDamage()) {
                    case Magic -> {
                        if (isCrit) {
                            hit += (int) (hit * caster.getCritDamage());
                        }
                    }
                    case Melee, Ranger -> {
                        if (isCrit) {
                            double critDamage = caster.getCritDamage() / 2;
                            hit += (int) (hit * critDamage);
                        }
                    }
                }
            }
            case Melee -> {
                switch (caster.getTypeDamage()) {
                    case Melee -> {
                        if (isCrit) {
                            hit += (int) (hit * caster.getCritDamage());
                        }
                    }
                    case Magic, Ranger -> {
                        if (isCrit) {
                            double critDamage = caster.getCritDamage() / 2;
                            hit += (int) (hit * critDamage);
                        }
                    }
                }
            }
            case Ranger -> {
                switch (caster.getTypeDamage()) {
                    case Ranger -> {
                        if (isCrit) {
                            hit += (int) (hit * caster.getCritDamage());
                        }
                    }
                    case Magic, Melee -> {
                        if (isCrit) {
                            double critDamage = caster.getCritDamage() / 2;
                            hit += (int) (hit * critDamage);
                        }
                    }
                }
            }
        }

        return Math.max(hit - target.getArmour(), 0);
    }

    private int calculateManaCost(Combatant caster) {
        int finalCost = manaCost;

        switch (skillType) {
            case DAMAGE -> {
                switch (caster.getTypeDamage()) {
                    case Magic -> {
                        if (typeDamage == TypeDamage.Magic) {
                            finalCost /= 2;
                        }
                    }
                    case Melee -> {
                        if (typeDamage == TypeDamage.Melee) {
                            finalCost /= 2;
                        }
                    }
                    case Ranger -> {
                        if (typeDamage == TypeDamage.Ranger) {
                            finalCost /= 2;
                        }
                    }
                }
            }

            case HEALING, DEFENSIVE, STUN -> {
                switch (caster.getTypeDamage()) {
                    case Magic, Melee, Ranger -> {
                        if (skillType != SkillType.DAMAGE) {
                            finalCost /= 2;
                        }
                    }
                }
            }
        }

        return finalCost;
    }
}
