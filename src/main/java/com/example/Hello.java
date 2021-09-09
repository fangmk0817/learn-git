package com.example;

/**
 * @Author: 方明坤
 * @Date: 2021/09/08/17:38
 * @Description:
 */
public class Hello {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.say("Git");
    }
    private void say(String str) {
        System.out.println("Hello " + str + "!");
    }
}
