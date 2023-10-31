package com.practice.day21;

/**
 * @author prakashponali
 * @Date 04/10/23
 */
public class HelpFromSam {

    public static void main(String[] args) {
        int A = 4;
        int samScore = 1;
        while(samScore * 2< A) {
            samScore = samScore << 1;
        }
        System.out.println(A - samScore + 1);
    }
}
