package com.topics.tree;

import java.util.ArrayDeque;
import java.util.Deque;

/*
100. Same Tree (https://leetcode.com/problems/same-tree/description/)

Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Example 1:
Input: p = [1,2,3], q = [1,2,3]
Output: true

Example 2:
Input: p = [1,2], q = [1,null,2]
Output: false

Example 3:
Input: p = [1,2,1], q = [1,1,2]
Output: false

Constraints:
-> The number of nodes in both trees is in the range [0, 100].
-> -104 <= Node.val <= 104
*/
public class SameTree {

    // 1. Recursive version
 /*       public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) return true;

            if (p == null || q == null) return false;

            if (p.val != q.val) return false;

            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }*/

    // 2. Iterable version
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(p);
        queue.add(q);

        while (!queue.isEmpty()) {
            p = queue.poll();
            q = queue.poll();


            if (p == null && q == null) continue;
            if (p == null || q == null) return false;
            if (p.val != q.val) return false;

            queue.add(p.left);
            queue.add(q.left);
            queue.add(p.right);
            queue.add(q.right);
        }
        return true;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
