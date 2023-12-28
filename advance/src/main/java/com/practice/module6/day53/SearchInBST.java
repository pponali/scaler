package com.practice.module6.day53;

/**
 * @Author prakashponali (@pponali)
 * @Date 25/12/23 4:05 pm
 * @Description :
 */
public class SearchInBST {

    public int solve(TreeNode A, int B) {
        if (A == null) {
            return 0;
        }
        if (A.val == B) {
            return 1;
        } else if (A.val > B) {
            return solve(A.left, B);
        } else {
            return solve(A.right, B);
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
}
