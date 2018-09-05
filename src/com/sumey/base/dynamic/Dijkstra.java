package com.sumey.base.dynamic;

import java.util.Scanner;

/**
 * @author sumey
 * @date 2018/9/5 上午11:22
 */

/**
 * 单源最短路径问题，O(n^2)
 * 优化：在dis[]寻找最近的点时，可用堆优化，使得时间复杂度从 O(n) 降低为 O(logN)
 * 当边M < N^2 时的稀疏图来说，可以用邻接表代替邻接矩阵
 * 优化完之后，时间复杂度变为 O((M+N)logN)
 */
public class Dijkstra {

    private static void dijkstra() {
        int[][] e = new int[10][10];
        int[] dis = new int[10];    //记录某一个点到其余个点的最短路径，每次要更新这个数组
        int[] isInS = new int[10];    //记录一个点是不是在结合S中，S存放的就是已经加入进去的确定的点
        int inf = 9999;                //存储我们认为的正无穷的值
        int i, j, n, m, t1, t2, t3, min;
        int u = -1;
        int v;


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

        //初始化dis数组，记录1到其余各点包括1的初始距离
        for (i = 1; i <= n; i++) {
            dis[i] = e[1][i];
        }

        //初始化book数组
        for (i = 1; i <= n; i++) {
            isInS[i] = 0;
        }
        isInS[1] = 1;   //表明一开始只有1在集合S中


        //核心算法语句
        for (i = 1; i <= n - 1; i++) {
            min = inf;
            for (j = 1; j <= n; j++) {
                if (isInS[j] == 0 && dis[j] < min) {
                    min = dis[j];
                    u = j;
                }
            }
            isInS[u] = 1;  //把u点加入集合
            for (v = 1; v <= n; v++) {
                if (e[u][v] < inf) {    //更新dis数组
                    if (dis[v] > dis[u] + e[u][v]) {
                        dis[v] = dis[u] + e[u][v];
                    }
                }
            }
        }

        //输出结果
        for (i = 1; i <= n; i++) {
            System.out.print(dis[i] + " ");
        }
    }

    public static void main(String[] args) {
        dijkstra();
    }
}
