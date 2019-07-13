package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Moive;
import com.stackroute.domain.MovieConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
public static void main(String[]args) {
    //using ApplicationContext

  AbstractApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
   BeanLifecycleDemoBean beanLifecycleDemoBean =context.getBean( BeanLifecycleDemoBean.class);
    context.close();


}
}
