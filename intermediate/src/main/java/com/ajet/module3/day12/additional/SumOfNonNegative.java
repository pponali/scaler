package com.ajet.module3.day12.additional;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 */
public class SumOfNonNegative {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1, 0, -1}, new int[][]{{0, 2}})));
        System.out.println(findMu(new  int[]{1,2,2,1}, new int[]{2,3,1,2}));
    }

    //common elements in two arrays
    public static int[] commonElements(int[] A, int[] B) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            set.add(A[i]);
        }
        int[] ans = new int[set.size()];
        int index = 0;
        for(int i : set){
            ans[index++] = i;
        }
        return ans;  // code here
    }

    public static int[] solve(int[] A, int[][] B) {
        int[] profit  = new int[B.length];

        //set.add()
        for(int i = 0; i < B.length; i++){
            int count = 0;
            for(int j = B[i][0]; j <= B[i][1]; j++ ){
                if(A[j] >= 0){
                    count++;
                }
            }
            profit[i] = count;
        }
        return profit;
    }

    //find common elements in two arrays
    public static int[] findMu(int[] A, int[] B){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++)
        {
            set.add(A[i]);
        }
        HashSet<Integer> commonset = new HashSet<>();
        for(int i = 0; i < B.length; i++)
        {
            if(set.contains(B[i])){
                commonset.add(B[i]);
            }
        }
        int[] ans = new int[commonset.size()];
        int idx = 0;
        for(int i : commonset){
            ans[idx] = i;
            idx++;
        }
        return ans;
    }


}
