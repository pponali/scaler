package com.practice.module4.day21;

/**
 * @author prakashponali
 * @Date 06/10/23
 */
public class FindingGoodDays {

    public static void main(String[] args) {
        System.out.println(solve(5));
    }
    public static int solve(int A) {
        int count = 0;
        while(A != 0){
            if((A & 1) == 1) {
                count++;
            }
            A = A >> 1;
        }
        return count;
    }
}