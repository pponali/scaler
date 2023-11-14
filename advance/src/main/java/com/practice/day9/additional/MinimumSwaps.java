package com.practice.day9.additional;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 *
 * Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.
 *
 * Note: It is possible to swap any two elements, not necessarily consecutive.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= length of the array <= 100000
 * -109 <= A[i], B <= 109
 *
 *
 *
 * Input Format
 *
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 *
 *
 *
 * Output Format
 *
 * Return the minimum number of swaps.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = [1, 12, 10, 3, 14, 10, 5]
 *  B = 8
 * Input 2:
 *
 *  A = [5, 17, 100, 11]
 *  B = 20
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  2
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  A = [1, 12, 10, 3, 14, 10, 5]
 *  After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
 *  After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
 *  Now, all elements less than or equal to 8 are together.
 * Explanation 2:
 *
 *  A = [5, 17, 100, 11]
 *  After swapping 100 and 11, A => [5, 17, 11, 100].
 *  Now, all elements less than or equal to 20 are together.
 *
 */
public class MinimumSwaps {


    public static void main(String[] args) {
        MinimumSwaps minimumSwaps = new MinimumSwaps();
        //System.out.println(minimumSwaps.minimumSwaps(new int[]{1, 12, 10, 3, 14, 10, 5}, 8));
        System.out.println(minimumSwaps.minimumSwaps(new int[]{5, 17, 100, 11}, 20));
    }

    public int minimumSwaps(int[] A, int B){
        int winddow = 0;
        for(int i = 0; i < A.length; i++){
            if(B >= A[i]){
                winddow++;
            }
        }
        int r = 0, l = 0, swaps = 0;
        while(r < winddow){
            if(A[r] > B)
                swaps++;
            r++;
        }
        int ans = swaps;
        while(r < A.length){
            if(A[r] > B){
                swaps++;
            }
            if(A[l] > B){
                swaps--;
            }
            l++;r++;
            ans = Math.min(ans, swaps);
        }
        return ans;
    }
}
