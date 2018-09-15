package com.sumey.writenExam.aiqiyi;

import java.util.Scanner;


/**
 * 小C有一张票，这张票的ID是长度为6的字符串，每个字符都是数字，他想让这个ID变成他的辛运ID，所以他就开始更改ID，每一次操作，他可以选择任意一个数字并且替换它。
 * <p>
 * 如果这个ID的前三位数字之和等于后三位数字之和，那么这个ID就是辛运的。你帮小C求一下，最少需要操作几次，能使ID变成辛运ID
 */


/**
 * 输入只有一行，是一个长度为6的字符串。
 * <p>
 * 输出这个最小操作次数
 */

//ac 了73，凉凉
public class LuckNumber {
    public static int max(int a, int b, int c) {
        if (a > b) {
            return a > c ? a : c;
        } else {
            return b > c ? b : c;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String seq = in.nextLine();

        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(String.valueOf(seq.charAt(i)));
        }
        int first = arr[0] + arr[1] + arr[2];
        int last = arr[3] + arr[4] + arr[5];

        int maxInfirst = max(arr[0], arr[1], arr[2]);
        int maxInlast = max(arr[3], arr[4], arr[5]);


        if (first == last) {
            System.out.println(0);
            return;
        }

        if (first > last) {
            if (first - last <= 9 - arr[3] || first - last <= 9 - arr[4] || first - last <= 9 - arr[5]) {
                System.out.println(1);
                return;
            } else if (first - last <= (18 - arr[3] - arr[4]) || first - last <= 18 - arr[4] - arr[5] || first - last <= 18 - arr[3] - arr[5]) {
                System.out.println(2);
                return;
            } else {
                if (first - last - maxInfirst <= 9 - arr[3] || first - last <= 9 - arr[4] || first - last <= 9 - arr[5]) {
                    System.out.println(2);
                    return;
                }
                System.out.println(3);
            }
        }

        if (first < last) {
            if (last - first <= 9 - arr[0] || last - first <= 9 - arr[1] || last - first <= 9 - arr[2]) {
                System.out.println(1);
                return;
            } else if (last - first <= (18 - arr[0] - arr[1]) || last - first <= 18 - arr[1] - arr[2] || last - first <= 18 - arr[2] - arr[0]) {
                System.out.println(2);
                return;
            } else {
                if (last - first - maxInlast <= 9 - arr[0] || last - first - maxInlast <= 9 - arr[1] || last - first - maxInlast <= 9 - arr[2]) {
                    System.out.println(2);
                    return;
                }
                System.out.println(3);
            }
        }

    }
}
