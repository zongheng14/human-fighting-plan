package com.human.juc;

import java.util.concurrent.atomic.AtomicReference;

/**
 * <>模拟自旋锁</>
 * @author shaonan.hu
 * @version V1.0
 * @Time 2020/11/2
 */
public class SpinLock {
    public static void main(String[] args) {
        Suosuo suosuo = new Suosuo();

        new Thread(() -> {
            //占有锁
            suosuo.myLock();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //释放锁
            suosuo.unMyLock();

        },"t1").start();


//        // 让main线程暂停1秒，使得t1线程，先执行
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        new Thread(() -> {
            //占有锁
            suosuo.myLock();
            //释放锁
            suosuo.unMyLock();
        },"t2").start();
    }

}

class Suosuo{
    //原子引用
    AtomicReference<Thread> atomicReference = new AtomicReference<>();
    /**
     * 加锁
     */
    public void myLock(){
        //获取当前线程
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "，当前线程");
        //模拟cas比较并交换
        if(!atomicReference.compareAndSet(null,thread)){
            System.out.println(thread.getName() + "，获取锁，循环等待");
        }
    }

    /**
     * 解锁
     */
    public void unMyLock(){
        //当前线程
        Thread thread = Thread.currentThread();
        //恢复锁
        boolean b = atomicReference.compareAndSet(thread, null);
        System.out.println(thread.getName() + "，释放锁，" + b);
    }
}
