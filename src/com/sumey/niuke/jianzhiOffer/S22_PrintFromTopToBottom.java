package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/14 下午5:03
 */

import java.util.ArrayList;

/**
 * 题目描述：
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class S22_PrintFromTopToBottom {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> printOrder = new ArrayList<Integer>();
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        if (root == null) {
            return printOrder;
        }
        queue.add(root);
        while (queue.size() != 0) {
            TreeNode temp = queue.remove(0);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            printOrder.add(temp.val);
        }
        return printOrder;
    }
}
