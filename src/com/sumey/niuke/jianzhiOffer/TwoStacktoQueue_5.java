package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/3 下午6:44
 */

import java.util.Stack;

/**
 * 题目描述：用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
//这个题目还是比较简单的～一次Ac
public class TwoStacktoQueue_5 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(Integer node) {
        stack1.push(node);
    }

    public Integer pop() {
        if (!stack2.empty()) {
            return stack2.pop();
        } else if (!stack1.empty()) {
            Integer temp = null;
            while (!stack1.empty()) {
                temp = stack1.pop();
                stack2.push(temp);
            }
            return stack2.pop();
        }
        return null;
    }
}
