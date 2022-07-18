package com.company.greeting;

import com.company.service.Greetingable;

public class GreetingBelarus implements Greetingable {

    @Override
    public String getGreeting(){
        return "Hello from Belarus!";
    }
}
