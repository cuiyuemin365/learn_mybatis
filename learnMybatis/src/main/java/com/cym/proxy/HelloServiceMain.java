package com.cym.proxy;

public class HelloServiceMain {

    public static void main(String[] args) {
        HelloServiceHandler handler = new HelloServiceHandler();
        HelloService proxy = (HelloService) handler.bind(new HelloServiceImpl());
        proxy.sayHello("Herry");
    }

}
