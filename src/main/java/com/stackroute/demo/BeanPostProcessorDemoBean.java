package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
//implementing beanpostprocessor
@Component
public class BeanPostProcessorDemoBean implements BeanPostProcessor {
//postprocessBeforeInitialization
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("beanPostProcessBeforeInitialization");
        return bean;
    }
//postprocessAfterInitialization
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("beanPostProcessAfterInitialization");
        return bean;

    }
}
