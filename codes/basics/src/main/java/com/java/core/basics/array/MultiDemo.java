package com.java.core.basics.array;

public class MultiDemo {

    public static void main(String[] args) {

        // 创建多维数组，两种创建方式效果相同
        Integer[][] array1 = new Integer[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Integer[][] array2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.println(array1[i][j]);
            }
        }

        for (Integer[] arrItem : array2) {
            for (int i = 0; i < arrItem.length; i++) {
                System.out.println(arrItem[i]);
            }
        }
    }
}
