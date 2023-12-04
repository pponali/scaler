package com.practice.day8.additional;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description
 *
 *
 * Problem Description
 * Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.
 *<p></p>
 * NOTE: The rightmost element is always a leader.
 *<p></p>
 *
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 108
 *<p></p>
 *
 * Input Format
 * There is a single input argument which a integer array A
 *<p></p>
 *
 * Output Format
 * Return an integer array denoting all the leader elements of the array.
 *<p></p>
 *
 * Example Input
 * Input 1:
 *  A = [16, 17, 4, 3, 5, 2]
 * Input 2:
 *  A = [5, 4]
 *<p></p>
 *
 * Example Output
 * Output 1:
 * [17, 2, 5]
 * Output 2:
 * [5, 4]
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *  Element 17 is strictly greater than all the elements on the right side to it.
 *  Element 2 is strictly greater than all the elements on the right side to it.
 *  Element 5 is strictly greater than all the elements on the right side to it.
 *  So we will return these three elements i.e [17, 2, 5], we can also return [2, 5, 17] or [5, 2, 17] or any other ordering.
 * Explanation 2:
 *  Element 5 is strictly greater than all the elements on the right side to it.
 *  Element 4 is strictly greater than all the elements on the right side to it.
 *  So we will return these two elements i.e [5, 4], we can also any other ordering.
 */
public class Leaders_in_an_array {

    public static void main(String[] args) {
        Leaders_in_an_array leadersInAnArray = new Leaders_in_an_array();
        System.out.println(Arrays.toString(leadersInAnArray.leadersInAnArray(new int[]{16, 17, 3, 5, 2})));
    }

    public int[] leadersInAnArray(int[] A){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(A[A.length - 1]);
        int max = A[A.length - 1];
        for(int i = A.length - 2; i >= 0; i--){
            if(A[i] > max){
                list.add(A[i]);
                max = A[i];
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
