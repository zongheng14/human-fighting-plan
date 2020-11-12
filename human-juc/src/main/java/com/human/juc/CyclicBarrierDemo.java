package com.human.juc;

import java.util.concurrent.CyclicBarrier;

/**
 * <>CyclicBarrier</>
 * <>循环屏障</>
 *
 * @author shaonan.hu
 * @version V1.0
 * @des 做加法，即只有集齐7颗龙珠，才能召唤神龙
 * @Time 2020/11/3
 */
public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
            System.out.println("召唤神龙");
        });


    }


}
