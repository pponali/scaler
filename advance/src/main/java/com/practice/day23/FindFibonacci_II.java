package com.practice.day23;

public class FindFibonacci_II {

    public static void main(String[] args) {
        System.out.println(findFib(10));

    }

    public static int findFib(int A){
        if(A < 0){
            return 1;
        }
        return findFib(A - 1) + findFib(A - 2);
    }
}
