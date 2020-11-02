package com.human.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shaonan.hu
 * @version V1.0
 * @Time 2020/10/19
 */
public class Collection_InterFace {

//    @Test
//    public void test01() {
//        AtomicInteger atomicInteger = new AtomicInteger(5);
//        System.out.println(atomicInteger.compareAndSet(5, 2019) + ",值：" + atomicInteger.get());
//        System.out.println(atomicInteger.compareAndSet(5, 2020) + ",值：" + atomicInteger.get());
//    }

    public static void main(String[] args) {

        new CopyOnWriteArraySet();

        Set set = new HashSet();
        set.add("a");

        String str = "abc";

        System.out.println(ConstClass.HELLOWORLD);

        Lock lock = new ReentrantLock(true);
    }
}

class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }



    public static final String HELLOWORLD = "hello world";
}
