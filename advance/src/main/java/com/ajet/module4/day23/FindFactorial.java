package com.ajet.module4.day23;

public class FindFactorial {

    public static void main(String[] args) {
        System.out.println(findFactorial(6));
    }

    public static int findFactorial(int A){
        if(A <= 1){
            return 1;
        }
        return findFactorial(A-1) * A;
    }
}
