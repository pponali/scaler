package com.practice.sort;

/**
 * @Author prakashponali
 * @Date 11/11/23
 * @Description
 */
public class Towers {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{63, 65, 6, 46, 82}, 79, 59));
    }

    public static int solve(int[] A, int B, int C) {
        int cost = 0;
        int i = 0;
        while (i < A.length) {
            int cost1 = 0;
            if(i + 1 < A.length){

                cost1 = B * (A[i + 1] + A[i]);

            }
            int cost2 = 0;
            if(i + 2 < A.length){

                cost2 = C * (A[i + 2] + A[i]);

            }
            if (cost1 < cost2) {
                i++;
                cost += cost1;
            } else {
                i = i + 2;
                cost += cost2;
            }
            if(cost1 == 0){
                cost += cost2;
            }
            if(cost2 == 0){
                cost += cost1;
            }
        }
        return cost;

    }

}
