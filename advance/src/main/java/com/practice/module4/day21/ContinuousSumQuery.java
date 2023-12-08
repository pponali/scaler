package com.practice.module4.day21;

/**
 * @author prakashponali
 * @Date 05/10/23
 */
public class ContinuousSumQuery {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,10},{2,3,20},{2,5,25}};
        System.out.println(new ContinuousSumQuery().continuousSumQuery(5, arr));
    }

    private int[] continuousSumQuery(final int A, final int[][] B) {

        int[] finalArray = new int[A];
        for(int i = 0; i < B.length;i++){
            finalArray[B[i][0] - 1] += B[i][2];
            if(B[i][1] < finalArray.length){
                finalArray[B[i][1]] -= B[i][2];
            }
        }

        int[] prefixArray = new int[finalArray.length];
        prefixArray[0] = finalArray[0];
        for(int i = 1; i < finalArray.length; i++){
            prefixArray[i] = prefixArray[i - 1] + finalArray[i];
        }
        return prefixArray;


    }

}
