package com.cym.proxy;

/**
 * Created by Administrator on 2017/6/23.
 */
public class HelloServiceImpl implements HelloService {

    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
