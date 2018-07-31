package com.academy.fx.annotation;

import java.lang.reflect.Method;

public class MainRunner {
    public static void main(String[] args) throws Exception {
       Class<?> clazz = Demo.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Main.class))
                method.invoke(new Demo());
        }
    }
}