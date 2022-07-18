package com.company.greeting;

import com.company.service.Greetingable;

public class GreetingUSA implements Greetingable {

    @Override
    public String getGreeting(){
        return  "Hello from USA!";
    }
}
