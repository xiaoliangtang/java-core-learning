package com.java.core.basics.operator;

public class Demo {

    public static void main(String[] args) {
        /**
         * 自增自减区别
         * 前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算
         * 后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算
         */
        int a = 1;
        int b = 2;
        int i = b*++a;
        int j = b*a++;
        System.out.println("i=" + i + "; j=" + j + "; a=" + a);
        // output: i=4; j=4; a=3
    }
}
