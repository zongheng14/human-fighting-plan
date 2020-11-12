package com.human.jvm;

/**
 * @author shaonan.hu
 * @version V1.0
 * @Time 2020/11/11
 */
public class ClinitTest {

    int a = 1;

    public static void main(String[] args) {
        System.out.println("aaa");
    }


    /**
     * 示例 1：无 static 变量
     */
//    private int a = 1;
//    public static void main(String[] args) {
//        int b = 2;
//    }


    /**
     * 示例 2：有 static 变量
     */

    //任何一个类声明以后，内部至少存在一个类的构造器
//    private int a = 1;
//    private static int c = 3;
//
//    public static void main(String[] args) {
//        int b = 2;
//    }


    /**
     * 构造器是虚拟机视角下的<init>()
     */
    //任何一个类声明以后，内部至少存在一个类的构造器
//    private int a = 1;
//    private static int c = 3;
//
//    public static void main(String[] args) {
//        int b = 2;
//    }
//
//    public ClinitTest(){
//        a = 10;
//        int d = 20;
//    }
}
