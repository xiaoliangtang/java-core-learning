package com.java.core.basics.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysDemo {

    public static void main(String[] args) {
        String[] array1 = {"curry", "lbj", "durant"};

        // 转列表
        List<String> list1 = Arrays.asList(array1);
        System.out.println(list1);
        // output: [curry, lbj, durant]

        // 查找
        int index = Arrays.binarySearch(array1, "lbj");
        System.out.println(index);
        // output: 1

        // 排序
        Arrays.sort(array1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 按字符串长度升序排列
                return o1.length() - o2.length();
            }
        });
        System.out.println(Arrays.asList(array1));
        // output: [lbj, curry, durant]
    }
}
