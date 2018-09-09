package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/8 下午7:46
 */

import java.util.ArrayList;

/**
 * 题目描述：输入一个整数数组，实现一个函数来调整该数组中数字的顺序
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class S13_reOrderArray {
    public static void reOrderArray(int[] array) {
        if (array.length == 0) {
            return;
        }
        ArrayList evenArray = new ArrayList();
        ArrayList oddArray = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray.add(array[i]);
            } else {
                oddArray.add(array[i]);
            }
        }

        int i = 0;
        for (Object x : oddArray
                ) {
            array[i++] = (Integer) x;
        }
        for (Object x : evenArray
                ) {
            array[i++] = (Integer) x;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 4, 1, 8, 6, 0};
        reOrderArray(a);
        for (int x : a
                ) {
            System.out.println(x);
        }
    }
}
