package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/8 下午5:48
 */

/**
 * 题目描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */

//经思考可以得处一个递推公式：f(n)=f(n-1)+f(n-2)+f(n-3)+...+f(0)=2*f(n-1)
public class S9_jumpFloor2 {
    public int JumpFloorII(int target) {
        if (target == 0) {
            return 0;
        } else if (target == 1) {
            return 1;
        } else {
            return JumpFloorII(target - 1) * 2;
        }

    }
}
