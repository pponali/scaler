package com.practice.day6.additional;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description Given an integer array A of size N. In one second, you can increase the value of one element by 1.
 * <p>
 * Find the minimum time in seconds to make all elements of the array equal.
 * <p>
 * <p>
 * Problem Constraints 1 <= N <= 1000000 1 <= A[i] <= 1000
 * <p>
 * <p>
 * Input Format First argument is an integer array A.
 * <p>
 * <p>
 * Output Format Return an integer denoting the minimum time to make all elements equal.
 * <p>
 * <p>
 * Example Input A = [2, 4, 1, 3, 2]
 * <p>
 * <p>
 * Example Output 8
 * <p>
 * <p>
 * Example Explanation We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 */
public class Time_to_equality {

    public static void main(String[] args) {
        Time_to_equality timeToEquality = new Time_to_equality();
        System.out.println(timeToEquality.timeToEquality(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }

    public int timeToEquality(int[] A) {
        int max = Integer.MIN_VALUE;
        for(int i : A){
            max = Math.max(max, i);
        }
        int minTimeToMakeAllEleEqual = 0;
        for(int i = 0; i < A.length; i++){
            if (max > A[i]) {
                minTimeToMakeAllEleEqual += max - A[i];
            }
        }
        return minTimeToMakeAllEleEqual;

    }

}
