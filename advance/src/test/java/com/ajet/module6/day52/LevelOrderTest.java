package com.ajet.module6.day52;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderTest {

    LevelOrder levelOrder;
    LevelOrder.TreeNode treeNode;

    @BeforeEach
    void setUp() {
        levelOrder = new LevelOrder();
        treeNode = new LevelOrder.TreeNode(346);
        treeNode.right = new LevelOrder.TreeNode(59);
        treeNode.left = new LevelOrder.TreeNode(162);
        treeNode.left.left = new LevelOrder.TreeNode(148);
        treeNode.left.right = new LevelOrder.TreeNode(18);
        treeNode.right.left = new LevelOrder.TreeNode(323);
        treeNode.right.right = new LevelOrder.TreeNode(113);
    }

    @AfterEach
    void tearDown() {
        levelOrder = null;
        System.gc();
    }

    @Test
    void levelOrder() {
        assertArrayEquals(new int[][]{{8},{4,7},{6,5},{2,3}}, levelOrder.levelOrder(treeNode));
    }
}