package com.topics.tree;


/*
144. Binary Tree Preorder Traversal (https://leetcode.com/problems/binary-tree-preorder-traversal/)

Given the root of a binary tree, return the preorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,2,3]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]

Constraints:
-> The number of nodes in the tree is in the range [0, 100].
-> -100 <= Node.val <= 100
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

/*
    // 1. Recursive version
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> result){
        if (root == null) return;

        result.add(root.val);
        helper(root.left, result);
        helper(root.right, result);
    }
*/

    // 2. Iterable version
    public List<Integer> preorderTraversal(TreeNode root) {
      Stack<TreeNode> stack = new Stack<>();
      List<Integer> result = new ArrayList<>();
      TreeNode curr;

      stack.push(root);

      while (!stack.isEmpty()) {
          curr = stack.pop();

          if(curr != null) {
              result.add(curr.val);
              stack.push(curr.right);
              stack.push(curr.left);
          }
      }

      return result;
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
