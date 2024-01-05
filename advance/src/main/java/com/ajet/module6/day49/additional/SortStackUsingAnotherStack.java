package com.ajet.module6.day49.additional;

import java.util.Stack;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 11/12/23
 * @Description
 */
public class SortStackUsingAnotherStack {


    public int[] sortStack(int[] A) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        for (int j : A) {
            s.push(j);
        }
        while(!s.isEmpty()) {
            int temp = s.pop();
            while(!stack.isEmpty() && stack.peek() < temp){
                s.push(stack.pop());
            }
            stack.push(temp);
        }
        int i = 0;
        while(!stack.isEmpty()){
            A[i] = stack.pop();
            i++;
        }
        return A;
    }


}
