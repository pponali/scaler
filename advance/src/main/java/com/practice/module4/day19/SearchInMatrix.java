package com.practice.module4.day19;

/**
 * @Author prakashponali (@pponali)
 * @Date 30/12/23 5:58 am
 * @Description :
 *<p></p>
 * Given a matrix of integers A of size N x M and an integer B.
 * In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form:
 * If A[i][j] = B then return (i * 1009 + j)
 * If B is not present return -1.
 *<p></p>
 * Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
 * Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
 * Note 3: Expected time complexity is linear
 * Note 4: Use 1-based indexing
 *<p></p>
 *
 * Problem Constraints
 * 1 <= N, M <= 1000
 * -100000 <= A[i] <= 100000
 * -100000 <= B <= 100000
 *<p></p>
 *
 * Input Format
 * The first argument given is the integer matrix A.
 * The second argument given is the integer B.
 *<p></p>
 *
 * Output Format
 * Return the position of B and if it is not present in A return -1 instead.
 *<p></p>
 *
 * Example Input
 * Input 1:-
 * A = [[1, 2, 3]
 *      [4, 5, 6]
 *      [7, 8, 9]]
 * B = 2
 * Input 2:-
 * A = [[1, 2]
 *      [3, 3]]
 * B = 3
 *<p></p>
 *
 * Example Output
 * Output 1:-
 * 1011
 * Output 2:-
 * 2019
 *<p></p>
 *
 * Example Explanation
 * Expanation 1:-
 * A[1][2] = 2
 * 1 * 1009 + 2 = 1011
 * Explanation 2:-
 * A[2][1] = 3
 * 2 * 1009 + 1 = 2019
 * A[2][2] = 3
 * 2 * 1009 + 2 = 2020
 * The minimum value is 2019
 *
 */

public class SearchInMatrix {

    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{2,8,8,8},{2,8,8,8},{2,8,8,8}}, 8));
    }

    public static int solve(int[][] A, int B) {
        int i =0, j=A[0].length - 1, ans = Integer.MAX_VALUE;
        while(i < A.length && j >= 0) {
            if(A[i][j] == B) {
                ans = Math.min(ans, (i + 1) * 1009 + (j + 1));
            } else if(A[i][j] > B) {
                j--;
            } else if(A[i][j] < B) {
                i++;
                if(ans != Integer.MAX_VALUE)
                    return ans;
            }
        }
        if(ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans;
        }

    }
}
