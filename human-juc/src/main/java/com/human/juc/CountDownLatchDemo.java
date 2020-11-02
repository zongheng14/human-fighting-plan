package com.human.juc;

import java.util.concurrent.CountDownLatch;

/**
 * <>CountDownLatch</>
 * @author shaonan.hu
 * @version V1.0
 * @Time 2020/11/2
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);//假设有6位同学
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + ".离开教室");
                countDownLatch.countDown(); //减一操作
            },String.valueOf(i)
            ).start();
        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName()  + ",关门走人");
    }
}
