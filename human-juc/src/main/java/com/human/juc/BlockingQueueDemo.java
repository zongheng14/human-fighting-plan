package com.human.juc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * <>BlockingQueue</>
 * <>阻塞队列</>
 * @desc 可替代wait notify
 * @author shaonan.hu
 * @version V1.0
 * @Time 2020/11/3
 */
public class BlockingQueueDemo {

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(5);

        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));
        System.out.println(blockingQueue.add("d"));
        System.out.println(blockingQueue.add("e"));
//        System.out.println(blockingQueue.add("f"));


//        System.out.println(blockingQueue.remove());
//        System.out.println(blockingQueue.remove());
//        System.out.println(blockingQueue.remove());
//        System.out.println(blockingQueue.remove());
//        System.out.println(blockingQueue.remove());

        System.out.println(blockingQueue.element());
//        System.out.println(blockingQueue.element());
//        System.out.println(blockingQueue.element());
//        System.out.println(blockingQueue.element());
//        System.out.println(blockingQueue.element());


    }
}
