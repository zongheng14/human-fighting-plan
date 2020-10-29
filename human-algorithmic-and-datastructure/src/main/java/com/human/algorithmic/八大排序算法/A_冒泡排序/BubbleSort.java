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
        //外层控制趟数, n个数,要循环n-1趟
        for (int i = 0; i < arr.length - 1; i++) { //[4,3,5,2,6]
            //内层控制比较次数，
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){ //前者 大于 后者 就交换，升序排列
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
