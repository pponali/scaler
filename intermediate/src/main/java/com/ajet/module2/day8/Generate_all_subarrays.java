package com.ajet.module2.day8;

import java.util.Arrays;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description You are given an array A of N integers. Return a 2D array consisting of all the subarrays of the array
 * <p>
 * Note : The order of the subarrays in the resulting 2D array does not matter.
 * <p>
 * <p>
 * Problem Constraints 1 <= N <= 100 1 <= A[i] <= 105
 * <p>
 * <p>
 * Input Format First argument A is an array of integers.
 * <p>
 * <p>
 * Output Format Return a 2D array of integers in any order.
 * <p>
 * <p>
 * Example Input Input 1: A = [1, 2, 3] Input 2: A = [5, 2, 1, 4]
 * <p>
 * <p>
 * Example Output Output 1: [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]] Output 2: [[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ],
 * [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]
 * <p>
 * <p>
 * Example Explanation For Input 1: All the subarrays of the array are returned. There are a total of 6 subarrays. For
 * Input 2: All the subarrays of the array are returned. There are a total of 10 subarrays.
 */
public class Generate_all_subarrays {

    public static void main(String[] args) {
        Generate_all_subarrays generateAllSubarrays = new Generate_all_subarrays();
        System.out.println(Arrays.deepToString(generateAllSubarrays.generateAllSubarrays(new int[]{1,2,3})));

    }

    public int[][] generateAllSubarrays(int[] A){
        int[][] mainArray = new int[A.length * (A.length + 1) / 2][];
        int m = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = i; j < A.length; j++){
                int[] subArray = new int[j - i + 1];
                for(int k = i; k <= j; k++){
                    subArray[k - i] = A[k];
                }
                mainArray[m] = subArray;
                m++;
            }
        }
        return mainArray;
    }
}
