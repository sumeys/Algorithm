package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/14 下午4:29
 */

import java.util.Stack;

/**
 * 题目描述：定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
//解法：利用两个栈，其中一个栈来正常使用，另一个栈顶保存最小的元素，遇见小于或等于栈顶，第二个就入栈
public class S20_minInStack {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
        if (stack2.empty()) {
            stack2.push(node);
        } else if (stack2.peek() >= node) {
            stack2.push(node);
        }
    }

    public void pop() {
        if (stack1.peek() == stack2.peek()) {
            stack2.pop();
        }
        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }

    public static void main(String[] args) {
        S20_minInStack s = new S20_minInStack();
        s.push(2);
        s.push(1);
        s.push(5);
        System.out.println(s.min());
    }
}
