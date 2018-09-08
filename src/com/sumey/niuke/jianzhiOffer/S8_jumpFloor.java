package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/8 下午5:27
 */

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */

//思路：其实就是斐波那契数列，比如跳6阶台阶，可以从第五跳1阶，也可以从第四跳2阶，第五为f(5)，第四为f(4)
//这里直接用递归的方法来做了，斐波那契的优化前面有
public class S8_jumpFloor {
    public int JumpFloor(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);

    }
}
