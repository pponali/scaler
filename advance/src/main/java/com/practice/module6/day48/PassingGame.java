package com.practice.module6.day48;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 08/12/23
 * @Description
 */

@Slf4j
public class PassingGame {

    private ListNode head;
    private int top = -1;

    public PassingGame(int i) {
        head = new ListNode(i);
    }


     public int solve(int A, int B, int[] C) {
         PassingGame solution = new PassingGame(B);
        for(int i = 0; i < A; i++){
            solution.passOne(i);
        }
        return solution.peak();
    }


    public void passOne(int iDPass) {
        if (iDPass == 0) {
            pop();
        } else {
            push(iDPass);
        }
    }


    public void push(int data) {
        ListNode nn = new ListNode(data);
        nn.next = head;
        head = nn;
        top++;
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
        top--;
    }

    public int peak() {
        return head != null ? head.val : -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top;
    }

    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

    }

    public void printStatck(PassingGame stack) {
        if (stack.head != null) {
            ArrayList<Integer> list = new ArrayList<>();
            while (head != null) {
                int peak = stack.peak();
                log.info(String.valueOf(peak));
                list.add(peak);
                stack.pop();
            }
            for (Integer integer : list) {
                stack.push(integer);
            }
        }
    }
}
