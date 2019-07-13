package com.stackroute;

import com.stackroute.domain.Moive;
import com.stackroute.domain.MovieConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[]args) {
    //using ApplicationContext

   ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
   Moive moive1=context.getBean( Moive.class);
   moive1.moiveDisplay();
    System.out.println("using BeanFactory");
    //XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource(MovieConfig.class));
    /*DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    BeanDefinitionRegistry register = new GenericApplicationContext(factory);
    BeanDefinitionReader reader = new XmlBeanDefinitionReader(register);
    reader.getRegistry();
    Moive picture1 = factory.getBean( Moive.class);
    picture1.moiveDisplay();*/






}
}
