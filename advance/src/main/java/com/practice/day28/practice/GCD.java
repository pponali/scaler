package com.practice.day28.practice;

public class GCD {

    public static void main(String[] args) {
        System.out.println(gcd(25, 7));
    }
    public static int gcd(int A, int B){
        if(B == 0){
            return A;
        }
        return gcd(B, A % B);
    }
}
