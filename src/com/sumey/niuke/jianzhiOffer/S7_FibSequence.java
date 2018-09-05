package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/4 下午8:32
 */

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class S7_FibSequence {

    //我的测试样例通过率5%？？？
    public static int Fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(3));
    }
}
