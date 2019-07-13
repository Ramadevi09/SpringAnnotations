package com.stackroute.domain;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:actorvalues.properties")
@ComponentScan("com.stackroute")
public class MovieConfig {

   /* @Bean
    //@Scope("prototype")
    public Moive moive(){
        Moive moive=new Moive();

        return moive;
    }*/


}
