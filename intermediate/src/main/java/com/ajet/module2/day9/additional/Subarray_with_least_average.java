package com.ajet.module2.day9.additional;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 *
 * Given an array A of size N, find the subarray of size B with the least average.
 *
 *
 *
 * Problem Constraints
 * 1 <= B <= N <= 105
 * -105 <= A[i] <= 105
 *
 *
 * Input Format
 * First argument contains an array A of integers of size N.
 * Second argument contains integer B.
 *
 *
 * Output Format
 * Return the index of the first element of the subarray of size B that has least average.
 * Array indexing starts from 0.
 *
 *
 * Example Input
 * Input 1:
 * A = [3, 7, 90, 20, 10, 50, 40]
 * B = 3
 * Input 2:
 *
 * A = [3, 7, 5, 20, -10, 0, 12]
 * B = 2
 *
 *
 * Example Output
 * Output 1:
 * 3
 * Output 2:
 *
 * 4
 *
 *
 * Example Explanation
 * Explanation 1:
 * Subarray between indexes 3 and 5
 * The subarray {20, 10, 50} has the least average
 * among all subarrays of size 3.
 * Explanation 2:
 *
 *  Subarray between [4, 5] has minimum average
 */
public class Subarray_with_least_average {

    public static void main(String[] args) {
        Subarray_with_least_average subarrayWithLeastAverage = new Subarray_with_least_average();
        ///\System.out.println(subarrayWithLeastAverage.subarrayWithLeastAverage(new int[]{3, 7, 90, 20, 10, 50, 40}, 3));
        //System.out.println(subarrayWithLeastAverage.subarrayWithLeastAverage(new int[]{3, 7, 5, 20, -10, 0, 12}, 2));
        //System.out.println(subarrayWithLeastAverage.subarrayWithLeastAverage(new int[]{15,7,11,7,9,8,18,1,16,18,6,1,1,4,18}, 6));
        System.out.println(subarrayWithLeastAverage.subarrayWithLeastAverage(new int[]{5,15,7,6,3,4,18,14,13,7,3,7,2,18}, 6));
        //System.out.println(subarrayWithLeastAverage.subarrayWithLeastAverage(new int[]{18,11,16,19,11,9,8,15,3,10,9,20,1,19}, 1));



    }

    public int subarrayWithLeastAverage(int[] A,int B){
        int r =0, l = 0, sum = 0, startIndex = 0;
        while(r < B){
            sum += A[r];
            r++;
        }
        int min = sum;
        while(r < A.length){
            sum = sum - A[l] + A[r];
            if(min > sum){
                min = sum;
                startIndex = l + 1;
            }
            r++;l++;
        }
        return startIndex;

    }
}
