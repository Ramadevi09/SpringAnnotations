package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class Moive {
    //actor class instantiation

    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //display actor details using movie method
public void moiveDisplay(){
    System.out.println("display using movie class");
    actor.display();
}



}
