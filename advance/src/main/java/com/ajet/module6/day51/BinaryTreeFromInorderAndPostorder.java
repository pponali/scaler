package com.ajet.module6.day51;


/**
 * Problem Description
 * Given the inorder and postorder traversal of a tree, construct the binary tree.
 *<p></p>
 * NOTE: You may assume that duplicates do not exist in the tree.
 *<p></p>
 *
 *
 * Problem Constraints
 * 1 <= number of nodes <= 105
 *<p></p>
 *
 *
 * Input Format
 * First argument is an integer array A denoting the inorder traversal of the tree.
 *<p></p>
 * Second argument is an integer array B denoting the postorder traversal of the tree.
 *<p></p>
 *
 *
 * Output Format
 * Return the root node of the binary tree.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *  A = [2, 1, 3]
 *  B = [2, 3, 1]
 * Input 2:
 *<p></p>
 *  A = [6, 1, 3, 2]
 *  B = [6, 3, 2, 1]
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *    1
 *   / \
 *  2   3
 * Output 2:
 *<p></p>
 *    1
 *   / \
 *  6   2
 *     /
 *    3
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 *  Create the binary tree and return the root node of the tree.
 */
public class BinaryTreeFromInorderAndPostorder {



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
