package com.human.juc;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author shaonan.hu
 * @version V1.0
 * @Time 2020/11/3
 */
public class SynchronousQueueDemo {

    public static void main(String[] args) {
//        new Thread(() -> {
//            try {
//
//                try {
//                    TimeUnit.SECONDS.sleep(5);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                blockingQueue.take();
//                System.out.println(Thread.currentThread().getName() + "\t take A ");
//
//                try {
//                    TimeUnit.SECONDS.sleep(5);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                blockingQueue.take();
//                System.out.println(Thread.currentThread().getName() + "\t take B ");
//
//                try {
//                    TimeUnit.SECONDS.sleep(5);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                blockingQueue.take();
//                System.out.println(Thread.currentThread().getName() + "\t take C ");
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }, "t2").start();
    }

    public void test() {

        BlockingQueue<String> blockingQueue = new SynchronousQueue<>();

        new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + "\t put A ");
                blockingQueue.put("A");

                System.out.println(Thread.currentThread().getName() + "\t put B ");
                blockingQueue.put("B");

                System.out.println(Thread.currentThread().getName() + "\t put C ");
                blockingQueue.put("C");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t1").start();
    }
}
