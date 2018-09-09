package com.sumey.writenExam.jingdong;

/**
 * @author sumey
 * @date 2018/9/9 下午8:21
 */

import java.util.Scanner;

/**
 * 题目描述：输入第一个数n,表述数据的条数
 * 接下里输入n次，每次3个数，记为a,b,c
 * 如果存在其他的aj,bj,cj,使得a<aj,b<bj,c<cj,则该商品为残次品
 * 输出：残次品的个数
 */
//已AC
public class FindUnqualified {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[][] array = new int[num][3];
        if (num == 0) {
            System.out.println(0);
        }
        //输入数据
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = in.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < num; i++) {
            int flag = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (array[i][0] < array[j][0] && array[i][1] < array[j][1] && array[i][2] < array[j][2]) {
                    count++;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                for (int j = i + 1; j < num; j++) {
                    if (array[i][0] < array[j][0] && array[i][1] < array[j][1] && array[i][2] < array[j][2]) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
