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
    System.out.println();
    Moive moive2=context.getBean(Moive.class);
    moive2.moiveDisplay();
    //checking bean scope
    System.out.println(moive1==moive2);







}
}
