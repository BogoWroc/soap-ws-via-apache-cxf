package com.tutorialspoint.helloworld;


import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) throws Exception {
        com.tutorialspoint.helloworld.HelloWorldPortType implementor = new HelloWorldImpl();
        Endpoint.publish("http://localhost:9090/HelloServerPort",
                implementor);
        System.out.println("Server ready...");
        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
