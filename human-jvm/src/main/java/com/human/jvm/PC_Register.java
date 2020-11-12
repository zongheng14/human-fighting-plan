package com.human.jvm;

/**
 * <>PC寄存器</>
 *
 * @author shaonan.hu
 * @version V1.0
 * @Time 2020/11/3
 */
public class PC_Register {
//   public static  int count = 1;
    public static void main(String[] args) {

        //test01
        test01();

        //测试栈的深度
//        System.out.println(count);
//        count++;
//        main(args);
    }

    /**
     * 程序计数器
     */
    public static void test01() {
        int i = 10;
        int j = 20;
        int k = i + j;
    }
}
