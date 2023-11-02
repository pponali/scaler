package com.practice.day23.additional;

public class Sum_of_Digits {

    public static void main(String[] args) {
        System.out.println(sum_of_Digits(123424));
    }
    public static int sum_of_Digits(int A){
        if(A==0){
            return 0;
        }
        return sum_of_Digits(A / 10) + A % 10;
    }

}
