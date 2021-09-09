package com.example.jdk8;

/**
 * @Author: 方明坤
 * @Date: 2021/09/09/8:53
 * @Description: lambda表达式示例
 */
public class LambdaDemo {
    public static void main(String[] args) {

        MathOperation addition = (int a, int b) -> a + b;
        LambdaDemo lambdaDemo = new LambdaDemo();

        System.out.println("10 + 5 = " + lambdaDemo.operate(10, 5, addition));

    }
    interface MathOperation {
        int operation(int a, int b);
    }
    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
