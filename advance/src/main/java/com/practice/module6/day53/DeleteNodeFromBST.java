package com.practice.module6.day53;

/**
 * @Author prakashponali (@pponali)
 * @Date 26/12/23 4:23 pm
 * @Description :
 * <p></p>
 * Given a Binary Search Tree(BST) A. If there is a node with value B present in the tree delete it and return the tree.
 * <p></p>
 * Note - If there are multiple options, always replace a node by its in-order predecessor
 * <p></p>
 * <p>
 * Problem Constraints
 * 2 <= No. of nodes in BST <= 105
 * 1 <= value of nodes <= 109
 * Each node has a unique value
 * <p></p>
 * <p>
 * Input Format
 * The first argument is the root node of a Binary Search Tree A.
 * The second argument is the value B.
 * <p></p>
 * <p>
 * Output Format
 * Delete the given node if found and return the root of the BST.
 * <p></p>
 * <p>
 * Example Input
 * Input 1:
 * <p></p>
 * 15
 * /    \
 * 12      20
 * / \    /  \
 * 10  14  16  27
 * /
 * 8
 * <p></p>
 * B = 10
 * <p></p>
 * Input 2:
 * <p></p>
 * 8
 * / \
 * 6  21
 * / \
 * 1   7
 * <p></p>
 * B = 6
 * <p></p>
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p></p>
 * 15
 * /    \
 * 12      20
 * / \    /  \
 * 8  14  16  27
 * <p></p>
 * Output 2:
 * <p></p>
 * 8
 * / \
 * 1  21
 * \
 * 7
 * <p></p>
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p></p>
 * Node with value 10 is deleted
 * Explanation 2:
 * <p>
 * Node with value 6 is deleted
 */
public class DeleteNodeFromBST {

    public TreeNode solve(TreeNode A, int B) {
        if(A == null) return null;
        if(A.val > B){
            A.left = solve(A.right, B);
        } else if(A.val < B){
            A.right = solve(A.left, B);
        } else {
            if(A.left == null && A.right == null){
                return null;
            } else if(A.left != null){
                return solve(A.right, B);
            } else if(A.right != null){
                return solve(A.left, B);
            } else {
                TreeNode temp = A.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                int max = temp.val;
                A.val = max;
                A.left = solve(A.right, max);
            }
        }
        return A;
    }



    static class TreeNode {
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
