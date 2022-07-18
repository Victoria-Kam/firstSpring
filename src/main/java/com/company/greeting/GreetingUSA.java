package com.company.greeting.later;

import com.company.service.Greetingable;

public class GreetingUSA implements Greetingable {

    @Override
    public String getGreeting(){
        return  "Hello from USA!";
    }
}
