package com.java.core.basics.array;

public class Demo {

    public static void main(String[] args) {

        // 创建数据
        int[] array1 = new int[3];
        int[] array2 = new int[] {1, 2, 3}; // {1, 2, 3}

        User[] array3 = new User[3];
        User[] array4 = new User[] {new User(), new User(), new User()};

        // 遍历
        for (int item : array1) {
            System.out.println(item);
        }
        for (int item : array2) {
            System.out.println(item);
        }
        for (User item : array3) {
            System.out.println(item);
        }
        for (User item : array4) {
            System.out.println(item);
        }

        // 访问
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        // 数组赋值
        int[] array5 = array2;
        array5[1] = 88;
        System.out.println("array2[1]: " + array2[1] + "; array5[1]: " + array5[1]);
        // output: array2[1]: 88; array5[1]: 88
    }
}

class User {

    // 声明数组变量
    public int[] ages; // 推荐风格
    private String names[]; // 效果相同

}
