package com.sumey.writenExam.meituan;

/**
 * @author sumey
 * @date 2018/9/6 下午11:06
 */

import java.util.*;

/**
 * 题目描述：第一行输入m,n,k ;m表述数列的个数，n表示区间的长度，k表示区间某个数出现的次数不少于k次
 * 输出：r 表述有多少个符合条件的区间
 * 样例：
 * 输入：5 3 2
 * 3 1 1 1 2
 * 输出：3 即有3个符合条件的区间[3 1 1] ,[1 1 1],[1 1 2]
 */
public class FindInterval {

    //统计数组某个数出现的次数
    private static HashMap findTime(int[] arr) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int x : arr
                ) {
            hs.add(x);
        }
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int x : hs
                ) {
            int count = 0;
            for (int y : arr
                    ) {
                if (x == y) {
                    count++;
                }
            }
            hashMap.put(x, count);
        }
        return hashMap;
    }


    private static void find() {
        int num, gap, times;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();   //数列的个数
        gap = in.nextInt();  //步长
        times = in.nextInt();   //出现次数

        //输入数组
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }

        int[] temp;
        int count = 0;
        for (int i = 0; i + gap <= num; i++) {
            temp = Arrays.copyOfRange(arr, i, i + gap);

            HashMap<Integer, Integer> hashMap = findTime(temp);
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue() >= times) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        find();
    }
}

