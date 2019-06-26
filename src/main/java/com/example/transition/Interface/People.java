package com.example.transition.Interface;

public class People implements Action {

    private static String head = "哈哈";

    public static String getHead() {
        return "笑你妹"+ head;
    }

    @Override
    public void fly() {
        System.out.println("我飞的好高");
    }

    @Override
    public String dance() {
        return "跳舞真有意思";
    }
}
