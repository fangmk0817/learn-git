package com.example.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: 方明坤
 * @Date: 2021/09/09/9:55
 * @Description: 函数式接口demo
 */
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("输出list中所有偶数:");
        eval(list, n-> n%2 == 0 );
    }
    private static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {
            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}

