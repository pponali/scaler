package com.ajet.module6.day53;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author prakashponali (@pponali)
 * @Date 26/12/23 5:18 pm
 * @Description :
 */
class DeleteNodeFromBSTTest {

    DeleteNodeFromBST deleteNodeFromBST;
    DeleteNodeFromBST.TreeNode treenode;


    @BeforeEach
    void setUp() {
        deleteNodeFromBST = new DeleteNodeFromBST();
        treenode = new DeleteNodeFromBST.TreeNode(2);
        treenode.left = new DeleteNodeFromBST.TreeNode(1);
        treenode.right = new DeleteNodeFromBST.TreeNode(3);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void solve() {
        deleteNodeFromBST.solve(treenode,2);
    }
}