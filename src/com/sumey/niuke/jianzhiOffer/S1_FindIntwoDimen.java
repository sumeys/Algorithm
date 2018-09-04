package com.sumey.niuke.jianzhiOffer;

/**
 * create by
 *
 * @author sumey
 * @date 2018/9/2 上午10:03
 */

/**
 * 题目描述：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class S1_FindIntwoDimen {

    //我的解法：case通过率：11.76%
    public static boolean Find(int target, int[][] array) {
        if (0 == array.length) {
            return false;
        }
        int row = array.length;
        int col = array[0].length;


        for (int i = 0; i < row; i++) {
            if (target > array[i][col - 1]) {
                continue;
            }

            //二分查找
            int low = 0;
            int high = col - 1;
            int middle = 0;
            while (low <= high) {
                middle = (low + high) >> 1;
                if (array[i][middle] > target) {
                    high = middle - 1;
                }
                if (array[i][middle] < target) {
                    low = middle + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    //参考解法
    public static boolean FindOptimize(int target, int[][] array) {
        int row = array.length;
        int col = array[0].length;
        int i, j;
        for (i = row - 1, j = 0; i >= 0 && j < col; ) {
            if (target == array[i][j]) {
                return true;
            }
            if (target > array[i][j]) {
                j++;
                continue;
            }
            if (target < array[i][j]) {
                i--;
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}, {5, 6}};
        boolean result = Find(8, a);
        System.out.println(result);
    }

}
