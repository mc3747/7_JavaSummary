package com.main;

import com.main.classDemo.DemoClass;

public class Main {

    public static void main(String[] args) {
        //✅
        System.out.println("Hello World !");
        //✅
        DemoClass demoClass = new DemoClass("kk");
        demoClass.age = 3;
        DemoClass.height = 6;
        demoClass.sleep();

    }
}
