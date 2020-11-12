package com.human.jvm;

/**
 * <>变量曹的重复利用</>
 * @author shaonan.hu
 * @version V1.0
 * @Time 2020/11/3
 */
public class SlotDemo {



    public static void main(String[] args) {
        SlotDemo slotDemo = new SlotDemo();
        slotDemo.localVar1();
        slotDemo.localVar2();
    }

    public void localVar1(){
        int temp;
        int a = 0;
        System.out.println(a);
        int b = 0;
    }

    public void localVar2() {
        {
            int a = 2;
            System.out.println(a);
        }
        int b = 3;
    }
}
