package org.jingyu.example.test;

import org.jingyu.example.spring.ApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext(AppConfig.class);
    }
}