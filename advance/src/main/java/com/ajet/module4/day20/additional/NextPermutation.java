package com.ajet.module4.day20.additional;

/**
 * @Author prakashponali (@pponali)
 * @Date 30/12/23 5:56 am
 * @Description :
 * <p></p>
 * Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers for a given array A of size N.
 *<p></p>
 * If such arrangement is not possible, it must be rearranged as the lowest possible order, i.e., sorted in ascending order.
 *<p></p>
 * NOTE:
 *<p></p>
 * The replacement must be in-place, do not allocate extra memory.
 * DO NOT USE LIBRARY FUNCTION FOR NEXT PERMUTATION. Use of Library functions will disqualify your submission retroactively and will give you penalty points.
 *<p></p>
 *
 * Problem Constraints
 * 1 <= N <= 5 * 105
 *<p></p>
 * 1 <= A[i] <= 109
 *<p></p>
 *
 *
 * Input Format
 * The first and the only argument of input has an array of integers, A.
 *<p></p>
 *
 *
 * Output Format
 * Return an array of integers, representing the next permutation of the given array.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *  A = [1, 2, 3]
 * Input 2:
 *<p></p>
 *  A = [3, 2, 1]
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  [1, 3, 2]
 * Output 2:
 *<p></p>
 *  [1, 2, 3]
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 *  Next permutaion of [1, 2, 3] will be [1, 3, 2].
 * Explanation 2:
 *<p></p>
 *  No arrangement is possible such that the number are arranged into the numerically next greater permutation of numbers.
 *  So will rearranges it in the lowest possible order.
 */
public class NextPermutation {

    public int[] nextPermutation(int[] A) {
        if(A.length == 1){
            return A;
        }
        if(A.length == 2) {
            int temp = A[0];
            A[0] = A[1];
            A[1] = temp;
            return A;
        }
        int temp, min = Integer.MAX_VALUE;;
        boolean swap = false;
        for(int i = A.length - 2 ; i > 0 ; i--) {
            if (A[i] < A[i + 1]) {
                int j = i + 2, minIndex = -1;
                while (j < A.length) {
                    if (A[j] < min && A[j] > A[i]) {
                        min = A[j];
                        minIndex = j;
                    }
                    j++;
                }
                if (minIndex != -1) {
                    temp = A[i];
                    A[i] = A[minIndex];
                    A[minIndex] = temp;
                } else {
                    temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                }
                swap = true;
                reverse(A, i + 1, A.length - 1);
                break;
            }

        }
        if(!swap){
            for(int i = 1; i < A.length; i ++){
                int j = i - 1, key = A[i];
                while(j >= 0 && A[j] > key){
                    A[j + 1] = A[j];
                    j--;
                }
                A[j + 1] = key;
            }
        }


        return A;
    }

    public static int[] reverse(int[] A, int a, int b) {
        int i = a, j = b, temp;
        for(; i < j; i++, j--){
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }
}
