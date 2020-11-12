package com.human.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author shaonan.hu
 * @version V1.0
 * @Time 2020/11/6
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024 * 200)];

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "mogu blog";
            while(true) {
                list.add(a);
                a = a + a;
                i++;
            }
        }catch (Exception e) {
            e.getStackTrace();
        }
    }
}
