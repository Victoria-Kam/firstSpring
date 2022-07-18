package com.company;

import com.company.service.Greetingable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingPrint {

    private final Greetingable greetingInter;

    @Autowired
    public GreetingPrint(Greetingable greetingInter){
        this.greetingInter = greetingInter;
    }

    public void printGreeting(){
        System.out.println(greetingInter.getGreeting());
    }
}
