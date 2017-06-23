package com.cym.proxy;

import java.lang.reflect.Method;

public class ReflectService {

    public void sayHello(String name) {
        System.out.println("hello " + name);
    }

    public static void main(String[] args) throws Exception {
        Object service = Class.forName(ReflectService.class.getName()).newInstance();
        Method method = service.getClass().getMethod("sayHello", String.class);
        method.invoke(service, "Jerly");
    }

}
