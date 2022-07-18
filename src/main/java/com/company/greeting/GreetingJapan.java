package com.company.greeting;

import com.company.service.Greetingable;

public class GreetingJapan implements Greetingable {

    @Override
    public String getGreeting(){
        return "Hello from Japan!";
    }
}
