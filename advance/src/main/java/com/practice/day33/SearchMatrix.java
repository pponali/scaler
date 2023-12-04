package com.practice.day33;

public class SearchMatrix {
    public static void main(String[] args) {

        //int[][] A = new int[][]{
        //        {2, 9, 12, 13, 16, 18, 18, 19, 20, 22},
        //        {29, 59, 62, 66, 71, 75, 77, 79, 97, 99}
        //};

        int[][] C = new int[][]{{3},
                {29},
                {36},
                {63},
                {67},
                {72},
                {74},
                {78},
                {85}
        };
        int D = 41;

        System.out.println(searchMatrix(C, D));

    }

    public static int searchMatrix(int[][] A, int B) {
        int l = 0, h = (A.length * A[0].length) - 1, mid = 0, length = A[0].length;
        int row = 0, col = 0;
        while(l <= h){
            mid = l + (h - l) / 2;
            row = mid / length; col = mid % length;
            System.out.println(" mid " + mid + " row " + row + " col " + col + " start " + l + " high " + h);
            if(A[row][col] == B){
                return 1;
            }else if(A[row][col] < B){
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return 0;
    }
}
