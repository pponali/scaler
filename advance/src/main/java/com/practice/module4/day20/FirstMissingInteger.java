package com.practice.module4.day20;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @Author prakashponali (@pponali)
 * @Date 30/12/23 5:52 am
 * @Description :
 * <p></p>
 * Given an unsorted integer array, A of size N. Find the first missing positive integer.
 *<p></p>
 * Note: Your algorithm should run in O(n) time and use constant space.
 *<p></p>
 *
 *
 * Problem Constraints
 * 1 <= N <= 1000000
 *<p></p>
 * -109 <= A[i] <= 109
 *<p></p>
 *
 *
 * Input Format
 * First argument is an integer array A.
 *<p></p>
 *
 *
 * Output Format
 * Return an integer denoting the first missing positive integer.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 * [1, 2, 0]
 * Input 2:
 *<p></p>
 * [3, 4, -1, 1]
 * Input 3:
 *<p></p>
 * [-8, -7, -6]
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 * 3
 * Output 2:
 *<p></p>
 * 2
 * Output 3:
 *<p></p>
 * 1
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 * A = [1, 2, 0]
 * First positive integer missing from the array is 3.
 * Explanation 2:
 *<p></p>
 * A = [3, 4, -1, 1]
 * First positive integer missing from the array is 2.
 * Explanation 3:
 *<p></p>
 * A = [-8, -7, -6]
 * First positive integer missing from the array is 1.
 */
public class FirstMissingInteger {

    public int firstMissingPositive(ArrayList<Integer> A) {
        for(int i = 0; i < A.size(); i++) {
            while(A.get(i) != i + 1 && A.get(i) > 0 && A.get(i) <= A.size()){
                if(Objects.equals(A.get(i), A.get(A.get(i) - 1))) {
                    break;
                }
                Integer temp = A.get(i);
                A.set(i, A.get(temp - 1));
                A.set(temp - 1, temp);
            }
        }
        for(int i = 0; i < A.size(); i++){
            if(A.get(i) != i + 1) {
                return i + 1;
            }
        }
        return A.size() + 1;
    }
}
