package com.spring.context;

import com.spring.annotation.ComponentScan;

import java.lang.annotation.Annotation;

public class MyApplicationContext {
    public MyApplicationContext() {
    }

    public MyApplicationContext(Class<?> clazz){
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation.annotationType() == ComponentScan.class){
                String scanPath = ((ComponentScan)annotation).path();
            }
        }
    }

    public Object getBean(String name){
        return null;
    }

    public Object getBean(Class<?> clazz){
        return null;
    }
}
