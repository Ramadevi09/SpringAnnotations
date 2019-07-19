package com.stackroute.domain;

import org.springframework.context.annotation.*;

@Configuration
//setting property file location 
@PropertySource("classpath:actorvalues.properties")
public class MovieConfig {
    @Bean
    public Actor actor(){
        Actor actor=new Actor();
        return actor;
    }
    @Bean
    //setting beanscop to prototype
    @Scope("prototype")
    public Moive moive(){
        Moive moive=new Moive(actor());

        return moive;
    }


}
