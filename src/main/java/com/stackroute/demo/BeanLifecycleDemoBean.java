package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initialization");
        System.out.println();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }
//custom init method
    public void customInit(){
        System.out.println("customInit");
    }
//custom destroy method
    public void customDestroy(){
        System.out.println("customDestroy");
    }
}
