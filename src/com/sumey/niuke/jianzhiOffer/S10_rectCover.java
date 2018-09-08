package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/8 下午5:57
 */

/**
 * 题目描述：我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class S10_rectCover {

    public static int RectCover(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1 || target == 2) {
            return target;
        } else {
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }
}
