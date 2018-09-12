package com.sumey.writenExam.xunlei;

import java.util.Scanner;

/**
 * @author sumey
 * @date 2018/9/12 下午7:53
 */

//已经ac
public class Gougushu {
    public static void getGouGuNum(int num) {
        int count = 0;
        for (int i = 1; i <= num - 2; i++) {
            for (int j = i + 1; j <= num - 1; j++) {
                int sum = i * i + j * j;
                int c = (int) Math.sqrt(sum);
                if (c * c == sum && c <= num) {
                    if (issu(i, j) && issu(i, sum) && issu(j, sum)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean issu(int m, int n) {
        int k, y;
        if (m < n) {
            k = m;
            m = n;
            n = k;
        }
        while (m % n != 0) {
            y = m % n;
            m = n;
            n = y;
        }
        if (1 == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        getGouGuNum(in.nextInt());
    }
}

/**
 * 有红黑两种颜色的方块积木，红色代表正数A，黑色代表负数B。选出17块积木排成一排，使得任意相邻7块积木之和都小于0。
 * 如何挑选才能使17块积木之和最大，最大值是多少？
 * <p>
 * 输入
 * 正数A，负数B
 * A和B绝对值小于10000
 * 输出
 * 积木之和的最大值
 * <p>
 * 样例输入
 * 10 -61
 * 样例输出
 * 28
 */
