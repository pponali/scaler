package com.practice.day11;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 *
 * Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 2*105
 * -108 <= A[i] <= 108
 *
 *
 * Input Format
 * First and only argument is an integer array A.
 *
 *
 *
 * Output Format
 * Return 1 if any such integer p is present else, return -1.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [3, 2, 1, 3]
 * Input 2:
 *
 *  A = [1, 1, 3, 3]
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  -1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  For integer 2, there are 2 greater elements in the array..
 * Explanation 2:
 *
 *  There exist no integer satisfying the required conditions.
 */
public class Noble_Integer {

    public static void main(String[] args) {
        Noble_Integer nobleInteger = new Noble_Integer();
        System.out.println(nobleInteger.solve(new int[]{9,2,7,4,5,7,6,1}));
    }

    public int solve(int[] A) {

        A = sort(A);
        if(A[A.length - 1] == 0) {
            return 1;
        }
        int ce = 0;
        for(int i = A.length - 2; i >= 0; i--) {
            if(A[i] != A[i + 1]) {
                ce = i;
            }
            if(A[i] == A.length - 1 - ce) {
                return 1;
            }
        }
        return -1;


    }

    public int[] sort(int[] A) {
        int last = A.length - 1;
        for (int i = 1; i < A.length; i++) {
            int max_index = 0;
            for(int j = 0; j <= last; j++) {
                if(A[j] > A[max_index]) {
                    max_index = j;
                }
            }
            int temp = A[max_index];
            A[max_index] = A[last];
            A[last] = temp; last --;
        }
        return A;
    }

}
