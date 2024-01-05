package com.ajet.module2.day6.additional;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description Given an array A and an integer B, find the number of occurrences of B in A.
 * <p>
 * <p>
 * Problem Constraints 1 <= B, Ai <= 109 1 <= length(A) <= 105
 * <p>
 * <p>
 * Input Format Given an integer array A and an integer B.
 * <p>
 * <p>
 * Output Format Return an integer, number of occurrences of B in A.
 * <p>
 * <p>
 * Example Input Input 1: A = [1, 2, 2], B = 2 Input 2: A = [1, 2, 1], B = 3
 * <p>
 * <p>
 * Example Output Output 1: 2 Output 2: 0
 * <p>
 * <p>
 * Example Explanation Explanation 1: Element at index 2, 3 is equal to 2 hence count is 2. Explanation 2: There is no
 * element equal to 3 in the array.
 */
public class Linear_Search_Multiple_Occurrences {

    public static void main(String[] args) {
        Linear_Search_Multiple_Occurrences linearSearchMultipleOccurrences = new Linear_Search_Multiple_Occurrences();
        System.out.println(linearSearchMultipleOccurrences.linearSearchMultipleOccurrences(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 5, 25, 5, 5}, 5));

    }

    public int linearSearchMultipleOccurrences(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                count++;
            }
        }
        return count;
    }
}
