package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/9 下午5:42
 */

/**
 * 题目描述：输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */

public class S17_HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                result = isRoot1HasRoot2(root1, root2);
            }
            if (!result) {
                result = HasSubtree(root1.left, root2);
            }
            if (!result) {
                result = HasSubtree(root1.right, root2);
            }
        }
        return result;

    }

    public boolean isRoot1HasRoot2(TreeNode node1, TreeNode node2) {
        if (node2 == null) {
            return true;
        }
        if (node1 == null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        return isRoot1HasRoot2(node1.left, node2.left) && isRoot1HasRoot2(node1.right, node2.right);
    }
}
