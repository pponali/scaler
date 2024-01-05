package com.practice.module2.day8.additional;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description Problem Description You are given an integer array A of size N.
 * <p>
 * You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of
 * the array A.
 * <p>
 * Find and return the maximum possible sum of the B elements that were removed after the B operations.
 * <p>
 * NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
 * <p>
 * Remove 3 elements from front and 0 elements from the back, OR Remove 2 elements from front and 1 element from the
 * back, OR Remove 1 element from front and 2 elements from the back, OR Remove 0 elements from front and 3 elements
 * from the back.
 * <p>
 * <p>
 * Problem Constraints 1 <= N <= 105
 * <p>
 * 1 <= B <= N
 * <p>
 * -103 <= A[i] <= 103
 * <p>
 * <p>
 * <p>
 * Input Format First argument is an integer array A.
 * <p>
 * Second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format Return an integer denoting the maximum possible sum of elements you removed.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = [5, -2, 3 , 1, 2] B = 3 Input 2:
 * <p>
 * A = [ 2, 3, -1, 4, 2, 1 ] B = 4
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 8 Output 2:
 * <p>
 * 9
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * Remove element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8 Explanation 2:
 * <p>
 * Remove the first element and the last 3 elements. So we get 2 + 4 + 2 + 1 = 9
 */
public class Pick_from_both_sides {

    public static void main(String[] args) {
        Pick_from_both_sides pickFromBothSides = new Pick_from_both_sides();
        System.out.println(pickFromBothSides.pickFromBothSides(new int[]{3,5,2,6,7,3,6,2,1,5,126,7,3,2}, 10));

    }

    public int pickFromBothSides(int[] A, int B){

        int[] prefixsumarray = new int[A.length];
        int[] sufixsumarray = new int[A.length];
        prefixsumarray[0] = A[0];
        for(int i = 1; i < A.length; i++) {
            prefixsumarray[i] = prefixsumarray[i - 1] + A[i];
        }
        sufixsumarray[A.length - 1] = A[A.length - 1];
        for(int i = A.length - 2; i >= 0; i--) {
            sufixsumarray[i] = sufixsumarray[i + 1] + A[i];
        }
        int ans = Math.max(prefixsumarray[B - 1], sufixsumarray[A.length - B]), N = A.length;
        for(int i = 1; i < B; i++) {
            ans = Math.max(ans, prefixsumarray[i - 1] + sufixsumarray[N - B + i]);
        }
        return ans;

        /*int[] prefix = new int[A.length];
        int[] suffix = new int[A.length];
        prefix[0] = A[0];
        for(int i = 1; i < A.length; i++){
            prefix[i] = prefix[i - 1] + A[i];
        }
        suffix[A.length - 1] = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] + A[i];
        }

        int max = Math.max(prefix[B - 1], suffix[A.length - B]);
        for(int i = 1; i < B; i++){
            max = Math.max(max ,prefix[i] + suffix[A.length - B + i]);
        }
        return max;*/

    }

}
