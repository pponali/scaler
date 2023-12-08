package com.practice.module6.day48;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 08/12/23
 * @Description
 *
 * Basic stack Operations.
 *
 *
 */
public class Stack {

    private ListNode head = null;
    private int top = -1;


    public void push(int data){
        ListNode nn = new ListNode(data);
        if(head == null){
            head = nn;
        } else {
            nn.next = head;
            head = nn;
        }
        top++;
    }

    public void pop(){
        if(head != null){
            head = head.next;
        }
        top--;
    }

    public int peak(){
        return top != -1 ? head.val : -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int size(){
        return top;
    }

    public static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val){
            this.val = val;
        }

    }

    public void printStatck(Stack stack){
        if(stack.head != null){
            ArrayList<Integer> list = new ArrayList<>();
            while(head != null){
                list.add(stack.peak());
                stack.pop();
            }
            for(Integer integer : list){
                stack.push(integer);
            }
        }
    }
}
