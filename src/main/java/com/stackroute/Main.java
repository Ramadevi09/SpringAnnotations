package com.stackroute;

import com.stackroute.domain.Moive;
import com.stackroute.domain.MovieConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[]args) {
    //retriving actor details using ApplicationContext

   ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
   Moive moive1=context.getBean( Moive.class);
   moive1.moiveDisplay();
}
}
