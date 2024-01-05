package com.ajet.module6.day53;

/**
 * @Author prakashponali (@pponali)
 * @Date 25/12/23 4:07 pm
 * @Description :
 * <p></p>
 * You are given a binary tree represented by root A. You need to check if it is a Binary Search Tree or not.
 *<p></p>
 * Assume a BST is defined as follows:
 *<p></p>
 * 1) The left subtree of a node contains only nodes with keys less than the node's key.
 *<p></p>
 * 2) The right subtree of a node contains only nodes with keys greater than the node's key.
 *<p></p>
 * 3) Both the left and right subtrees must also be binary search trees.
 *<p></p>
 *
 *
 * Problem Constraints
 * 1 <= Number of nodes in binary tree <= 105
 *<p></p>
 * 0 <= node values <= 232-1
 *<p></p>
 *
 *
 * Input Format
 * First and only argument is head of the binary tree A.
 *<p></p>
 *
 *
 * Output Format
 * Return 0 if false and 1 if true.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *
 *    1
 *   /  \
 *  2    3
 * Input 2:
 *<p></p>
 *
 *   2
 *  / \
 * 1   3
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  0
 * Output 2:
 *<p></p>
 *  1
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 *  2 is not less than 1 but is in left subtree of 1.
 * Explanation 2:
 *
 * Satisfies all conditions.
 */
public class ValidBinarySearchTree {
    public static void main(String[] args) {

    }

    public int isValidBST(TreeNode A) {
        return 0;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

}
