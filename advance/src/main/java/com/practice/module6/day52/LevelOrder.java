package com.practice.module6.day52;

import lombok.extern.slf4j.Slf4j;
import org.codehaus.plexus.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;


@Slf4j
public class LevelOrder {

    public int[][] levelOrder(TreeNode treeNode){

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        /*Queue<TreeNode> stack = new Queue<>();
        stack.push(treeNode);
        while(!stack.isEmpty()){
            int n = stack.size();
            ArrayList<Integer> list = null;
            for(int i = 1; i <= n; i++){
                list = new ArrayList<>();
                TreeNode node = stack.peek();
                list.add(node.val);
                log.info("Node value is {}", node.val);
                stack.pop();
                if(node.left != null){
                    stack.push(node.left);
                }
                if(node.right != null){
                    stack.push(node.right);
                }
            }
            if(!list.isEmpty()){
                lists.add(list);
            }
            log.info("{}" , "\n");
        }*/
        return lists.stream().map(x -> x.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
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
