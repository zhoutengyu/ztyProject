package com.example.demo.test;

/**
 * Created by admin on 2018/6/14.
 */
public class Circle extends Shape {
    public String name = "circle";

    public Circle() {
        System.out.println("circle constructor");
    }

    public void printType() {
        System.out.println("this is circle");
    }

    public static void printName() {
        System.out.println("circle");
    }

}
