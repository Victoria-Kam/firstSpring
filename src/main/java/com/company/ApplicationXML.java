package com.company;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationXML {

    public static void main(String[] arg) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        GreetingPrint greetin = (GreetingPrint) context.getBean("greetingPrint");

        System.out.println("First country");
        greetin.printGreeting();

        System.out.println("\nSecond country");
        greetin = (GreetingPrint) context.getBean("greetingPrintUSA");
        greetin.printGreeting();

        System.out.println("\nThird country");
        greetin = (GreetingPrint) context.getBean("greetingPrintJapan");
        greetin.printGreeting();
    }

}
