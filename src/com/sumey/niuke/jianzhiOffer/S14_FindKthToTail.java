package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/9 下午5:07
 */

/**
 * 题目描述：输入一个链表，输出该链表中倒数第k个结点。
 */
//比较基础的题目
public class S14_FindKthToTail {

    //自己的解法，常规
    public ListNode FindKthToTail(ListNode head, int k) {
        int num = 0;
        ListNode p = head;
        while (p != null) {
            num++;
            p = p.next;
        }
        if (k > num) {
            return null;
        }
        p = head;
        for (int i = 2; i <= num - k + 1; i++) {
            p = p.next;
        }
        return p;
    }

    // 参考优化解法
    public ListNode FindKthToTail_2(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode p, q;
        p = q = head;
        for (int i = 1; i <= k - 1; i++) {
            if (q.next != null) {
                q = q.next;
            } else {
                return null;
            }
        }
        while (q.next != null) {
            q = q.next;
            p = p.next;
        }
        return p;
    }
}
