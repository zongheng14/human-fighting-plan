package com.human.algorithmic.八大排序算法.B_选择排序;

/**
 * @author shaonan.hu
 * @version V1.0
 * @Time 2020/10/29
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 9, 5, 7, 6, 8};
        sort(arr);
    }

    public static int[] sort(int[] arr) {

        int[] res = new int[arr.length];

        //需要比较的次数
        for (int i = 0; i < arr.length - 1; i++) {
            //先假设当前循环中，第一个元素是最小的
            int minIndex = i;
            //循环出数组中，数值最小的那个元素，并保留其索引位置
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; //满足判断条件，就将最小元素的索引，赋值给minIndex变量
                }
            }

            System.out.println("第" + (i + 1) + "趟，最小索引值为：" + minIndex + ",元素为：" + arr[minIndex]);

            /**
             * 执行完以上的for循环，就选出最小元素的索引了
             * 经过一轮循环，就可以找出第一个最小值的索引，然后把最小值放到i的位置
             */
            int[] swap = swap(arr, i, minIndex);

            System.out.print("排序结果：");
            //根据该循环，可清楚了解 每一步交换的结果
            for (int j = 0; j < swap.length; j++) {
                System.out.print(swap[j] + ",");
                if (j == swap.length - 1) {
                    System.out.println("");
                }
            }
        }
        return res;
    }

    private static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
