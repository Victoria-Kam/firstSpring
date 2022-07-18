package com.company.greeting.later;

import com.company.service.Greetingable;

public class GreetingJapan implements Greetingable {

    @Override
    public String getGreeting(){
        return "Hello from Japan!";
    }
}
