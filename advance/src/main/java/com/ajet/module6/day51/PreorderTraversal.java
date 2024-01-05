package com.ajet.module6.day51;

import java.util.ArrayList;
import java.util.Objects;

public class PreorderTraversal {

    public int[] preorderTraversal(TreeNode A) {

        ArrayList<Integer> list = new ArrayList<>();

        preorder(list, A);
        return list.parallelStream().filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();
    }

    public void preorder(ArrayList<Integer> list, TreeNode A) {
        if (A == null) {
            return;
        }
        list.add(A.val);
        preorder(list, A.left);
        preorder(list, A.right);
    }

    class TreeNode {
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
