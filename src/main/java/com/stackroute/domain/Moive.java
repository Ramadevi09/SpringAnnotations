package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Moive implements ApplicationContextAware,BeanFactoryAware,BeanNameAware{
    //actor class instantiation
    @Autowired
    private Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    //display actor details using movie method
public void moiveDisplay(){
    System.out.println("display using movie class");
    actor.display();
}


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("in setApplicationContext method");
        Moive moive=applicationContext.getBean(Moive.class);
        moive.moiveDisplay();
        System.out.println();
    }
//retriving beanfatory
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("bean factory is::"+beanFactory);
    }
//retriving beanname
    @Override
    public void setBeanName(String beanName) {
        System.out.println("bean name is:"+beanName);
    }
}
