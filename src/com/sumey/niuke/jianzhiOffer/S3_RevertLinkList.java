package com.sumey.niuke.jianzhiOffer;

import java.util.ArrayList;

/**
 * @author sumey
 * @date 2018/9/2 下午12:40
 */

/**
 * 题目描述：输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class S3_RevertLinkList {
    static ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListNode l0 = new ListNode(0);
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l0.next = l1;
        l1.next = l2;
        l2.next = l3;
        printListFromTailToHead(l0);
        for (int x : arrayList
                ) {
            System.out.println(x);
        }
    }

}