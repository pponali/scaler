package com.practice.day28;

public class Largest_Coprime_Divisor {

    public static void main(String[] args) {
        System.out.println(cpFact(25, 7));
    }
    public static int cpFact(int A, int B) {
        while(gcd(A, B) != 1){
            A = A/gcd(A,B);
        }
        return A;
    }

    public static int gcd(int A, int B){
        if(B == 0){
            return A;
        }
        return gcd(B, A%B);
    }
}
