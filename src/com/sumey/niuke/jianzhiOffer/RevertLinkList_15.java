package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/2 下午12:45
 */

/**
 * 题目描述：输入一个链表，反转链表后，输出新链表的表头。
 */

/*class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

public class RevertLinkList_15 {
    public static ListNode ReverseList(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode l0 = new ListNode(0);
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l0.next = l1;
        l1.next = l2;
        l2.next = l3;
        ReverseList(l0);
        System.out.println(l2.next.val);
    }
}
