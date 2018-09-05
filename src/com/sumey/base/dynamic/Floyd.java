package com.sumey.base.dynamic;

import java.util.Scanner;

/**
 * @author sumey
 * @date 2018/9/5 上午10:53
 */

/**
 * floyd算法，T:O(n^3)   S:O(N^2)
 * 求任意两个点之间的最短距离
 */
public class Floyd {
    private static void floyd() {
        int e[][] = new int[10][10];         //矩阵，暂时假定不超过十个顶点
        int k, i, j, n, m, t1, t2, t3;       //n表示顶点的个数，m表示边的条数; t1，t2，t3表示从点t1到点t2的距离是t3
        int inf = 9999;                      //inf假定是我们认为的正无穷

        Scanner in = new Scanner(System.in);

        //输入n,m的值
        n = in.nextInt();
        m = in.nextInt();

        //初始化
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == j) {
                    e[i][j] = 0;
                } else {
                    e[i][j] = inf;
                }
            }
        }


        //输入边
        for (i = 1; i <= m; i++) {
            t1 = in.nextInt();
            t2 = in.nextInt();
            t3 = in.nextInt();
            e[t1][t2] = t3;
        }

        //核心算法
        for (k = 1; k <= n; k++) {
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    if (e[i][j] > e[i][k] + e[k][j]) {
                        e[i][j] = e[i][k] + e[k][j];
                    }
                }
            }
        }

        //输出结果
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(e[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        floyd();
    }
}
