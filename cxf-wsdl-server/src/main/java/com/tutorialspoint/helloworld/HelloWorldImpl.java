package com.tutorialspoint.helloworld;
public class HelloWorldImpl implements com.tutorialspoint.helloworld.HelloWorldPortType {
    @Override
    public String greetings(String name) {
        return ("hi " + name);
    }
}
