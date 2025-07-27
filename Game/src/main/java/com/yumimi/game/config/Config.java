package com.yumimi.game.config;

import com.yumimi.game.models.inventory.Equipment;
import com.yumimi.game.models.inventory.items.ItemFabric;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class Config {

    @Bean
    public Equipment equipment() {
        return new Equipment();
    }

    @Bean
    public ItemFabric itemFabric(){
        return new ItemFabric();
    }
}
