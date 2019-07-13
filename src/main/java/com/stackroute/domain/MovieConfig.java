package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySource("classpath:actorvalues.properties")
public class MovieConfig {
    @Bean
    public Actor actor(){
        Actor actor=new Actor();
        return actor;
    }
    @Bean
    public Moive moive(){
        Moive moive=new Moive();
moive.setActor(actor());
        return moive;
    }


}
