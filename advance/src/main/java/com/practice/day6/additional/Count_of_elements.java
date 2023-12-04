package com.practice.day6.additional;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description Given an array A of N integers. Count the number of elements that have at least 1 elements greater than
 * itself.
 * <p>
 * <p>
 * Problem Constraints 1 <= N <= 105 1 <= A[i] <= 109
 * <p>
 * <p>
 * Input Format First and only argument is an array of integers A.
 * <p>
 * <p>
 * Output Format Return the count of elements.
 * <p>
 * <p>
 * Example Input Input 1: A = [3, 1, 2] Input 2: A = [5, 5, 3]
 * <p>
 * <p>
 * Example Output Output 1: 2 Output 2: 1
 * <p>
 * <p>
 * Example Explanation Explanation 1: The elements that have at least 1 element greater than itself are 1 and 2
 * Explanation 2: The elements that have at least 1 element greater than itself is 3
 */
public class Count_of_elements {

    public static void main(String[] args) {
        Count_of_elements countOfElements = new Count_of_elements();
        System.out.println(countOfElements.countOfElements(new int[]{1, 2, 3}));
    }

    public int countOfElements(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if (A[i] < A[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
