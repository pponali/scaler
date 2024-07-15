package com.ajet.module9.day96.assignment;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   15/07/24 2:06 pm
 *
 * feature icon
 * Using hints except Complete Solution is Penalty free now
 * Use Hint
 * Raw Problem
 * **Raw Problem**
 * Write code to achieve the following
 * A class Node to represent the Node of a BinaryTree.
 * Node should have two properties - left and right of type Node.
 * Node should also have an integer property - data.
 * Create a class TreeSizeCalculator to calculate the size of a BinaryTree using multiple threads.
 * TreeSizeCalculator constructor will be passed the root of the tree and ExecutorService to make new threads.
 * TreeSizeCalculator should implement Callable<Integer> interface
 *
 *
 */
public class ThreadsWithCallables2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
        root.right.right.right.right = new Node(9);
        root.right.right.right.right.right = new Node(10);
        root.right.right.right.right.right.right = new Node(11);
        root.right.right.right.right.right.right.right = new Node(12);
        root.right.right.right.right.right.right.right.right = new Node(13);
        root.right.right.right.right.right.right.right.right.right = new Node(14);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        TreeSizeCalculator treeSizeCalculator = new TreeSizeCalculator(root, executorService);
        try {
            System.out.println(treeSizeCalculator.call());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /**
     * Node class to represent a node in a binary tree.
     */
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    /**
     * TreeSizeCalculator class to calculate the size of a binary tree using multiple threads.
     */
    static class TreeSizeCalculator implements Callable<Integer> {
        private final Node node;
        private final ExecutorService executorService;

        TreeSizeCalculator(Node node, ExecutorService executorService) {
            this.node = node;
            this.executorService = executorService;
        }

        @Override
        public Integer call() throws Exception {
            if (node == null) {
                return 0;
            }
            Future<Integer> leftSizeFuture = executorService.submit(new TreeSizeCalculator(node.left, executorService));
            Future<Integer> rightSizeFuture = executorService.submit(new TreeSizeCalculator(node.right, executorService));
            return 1 + leftSizeFuture.get() + rightSizeFuture.get();
        }
    }
}
