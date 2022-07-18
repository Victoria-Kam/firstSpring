package com.company;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationXML {

    ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
    GreetingPrint greetin = (GreetingPrint) context.getBean("greetingPrint");


}
