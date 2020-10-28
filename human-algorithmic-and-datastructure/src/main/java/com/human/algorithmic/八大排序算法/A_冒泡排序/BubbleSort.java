package com.human.algorithmic.八大排序算法.A_冒泡排序;

/**
 * <></>
 *
 * @author shaonan.hu
 * @version V1.0
 * @Time 2020/10/28
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 9, 5, 7, 6, 8};
        int[] resArr = bubbleSort(arr);
        for (int j = 0; j < resArr.length; j++) {
            System.out.println(resArr[j]);
        }

    }


    public static int[] bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { //外层控制排序趟数
            for (int j = 0; j < arr.length - 1 - i; j++) {  //内层控制比较次数
                if (arr[j] > arr[j + 1]) { //满足条件，比较后交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


}
