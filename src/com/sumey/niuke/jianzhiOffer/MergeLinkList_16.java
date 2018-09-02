package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/2 下午1:49
 */

/**
 * 题目描述：输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeLinkList_16 {
    //递归版本
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (null == list1) {
            return list2;
        } else if (null == list2) {
            return list1;
        }
        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }

    }

    //非递归版本,个人写的太麻烦
    public ListNode Merge2(ListNode list1, ListNode list2) {
        ListNode root = new ListNode(-1);
        ListNode current = null;
        if (list1 == null) {
            return list2;
        } else if (null == list2) {
            return list1;
        }

        if (list1.val < list2.val) {
            root = current = list1;
            list1 = list1.next;
        } else {
            root = current = list2;
            list2 = list2.next;
        }

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                current = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                current = list2;
                list2 = list2.next;
            }
        }
        if (null != list1) {
            current.next = list1;

        }
        if (null != list2) {
            current.next = list2;

        }
        return root;

    }

    //非递归版本优化
    public ListNode Merge3(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        head.next = null;
        ListNode root = head;
        while (null != list1 && null != list2) {
            if (list1.val < list2.val) {
                head.next = list1;
                head = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                head = list2;
                list2 = list2.next;
            }
        }
        if (null != list1) {
            head.next = list1;
        }
        if (null != list2) {
            head.next = list2;
        }
        return root.next;
    }

}
