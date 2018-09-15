package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/14 下午8:01
 */

/**
 * 题目描述：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class S23_VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        if (sequence.length == 1) {
            return true;
        } else {
            return judge(sequence, 0, sequence.length - 1);
        }
    }

    public boolean judge(int[] a, int start, int end) {
        if (start >= end) {
            return true;
        }
        int i = start;
        while (a[i] < a[end]) {
            i++;
        }
        for (int j = i; j < end; j++) {
            if (a[j] < a[end]) {
                return false;
            }
        }
        return judge(a, start, i - 1) && judge(a, i, end - 1);
    }
}
