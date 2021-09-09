package com.example.jdk8;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 方明坤
 * @Date: 2021/09/09/9:33
 * @Description: 方法引用
 */
public class MethodReference {
    public static void main(String[] args) {
        List<String> names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }
}
