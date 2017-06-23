package com.cym.proxy;

/**
 * Created by Administrator on 2017/6/23.
 */
public class HelloServiceMain {

    public static void main(String[] args) {
        HelloServiceHandler handler = new HelloServiceHandler();
        HelloService proxy = (HelloService) handler.bind(new HelloServiceImpl());
        proxy.sayHello("Herry");
    }

}
