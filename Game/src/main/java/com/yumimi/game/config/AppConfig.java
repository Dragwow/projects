package com.yumimi.game.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class AppConfig {

    private static ConfigurableApplicationContext context;

    public static void initSpring(){
        context = new SpringApplicationBuilder(GameConfig.class).run();
    }

    public static <T> T getBeans(Class<T> tClass){
        return context.getBean(tClass);
    }

    public static void stop(){
        if (context != null) context.close();
    }
}
