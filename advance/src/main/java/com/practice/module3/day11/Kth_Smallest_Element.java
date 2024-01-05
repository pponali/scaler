package com.practice.module3.day11.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 *
 * Find the Bth smallest element in given array A .
 *
 * NOTE: Users should try to solve it in less than equal to B swaps.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 *
 * 1 <= B <= min(|A|, 500)
 *
 * 1 <= A[i] <= 109
 *
 *
 *
 * Input Format
 * The first argument is an integer array A.
 *
 * The second argument is integer B.
 *
 *
 *
 * Output Format
 * Return the Bth smallest element in given array.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [2, 1, 4, 3, 2]
 * B = 3
 * Input 2:
 *
 * A = [1, 2]
 * B = 2
 *
 *
 * Example Output
 * Output 1:
 *
 *  2
 * Output 2:
 *
 *  2
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  3rd element after sorting is 2.
 * Explanation 2:
 *
 *  2nd element after sorting is 2.
 */
public class Kth_Smallest_Element {
    public static void main(String[] args) {
        Kth_Smallest_Element kthSmallestElement= new Kth_Smallest_Element();
        System.out.println(kthSmallestElement.kthSmallestElement(new int[]{9,2,7,4,5,7,6,1}, 5));
    }

    public int kthSmallestElement(int[] A, int B){
        ArrayList list = new ArrayList<>(Collections.singleton(Arrays.stream(A).boxed()));
        Collections.sort(list);
        return (int) list.get(B -1);

    }
}
