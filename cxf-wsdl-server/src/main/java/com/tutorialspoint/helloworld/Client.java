package com.tutorialspoint.helloworld;
public class Client {
    public static void main(String[] args) throws Exception {
        //Create the service client with its default wsdlurl
        HelloWorldService helloServiceService = new HelloWorldService();
        System.out.println("service: " +
                helloServiceService.getServiceName());
        System.out.println("wsdl location: " +
                helloServiceService.getWSDLDocumentLocation());
        HelloWorldPortType helloService =
                helloServiceService.getHelloWorldPort();
        System.out.println(helloService.greetings("Bogumil"));
    }
}
