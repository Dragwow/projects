package com.yumimi.game.config;

import com.yumimi.game.models.inventory.Inventory;
import com.yumimi.game.models.inventory.items.crafts_items.CraftItemFactory;
import com.yumimi.game.models.inventory.items.magic_items.MagicItemFactory;
import com.yumimi.game.models.inventory.items.potion.PotionFactory;
import com.yumimi.game.models.inventory.items.robes.RobeFactory;
import com.yumimi.game.models.inventory.items.weapon.WeaponFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class Config {

    @Bean
    public Inventory inventory(){return new Inventory();}

    @Bean
    public WeaponFactory weaponFactory(){return new WeaponFactory();}

    @Bean
    public CraftItemFactory craftItemFactory(){return new CraftItemFactory();}

    @Bean
    public MagicItemFactory magicItemFactory(){return new MagicItemFactory();}

    @Bean
    public PotionFactory potionFactory(){return new PotionFactory();}

    @Bean
    public RobeFactory robeFactory(){return new RobeFactory();}


}
