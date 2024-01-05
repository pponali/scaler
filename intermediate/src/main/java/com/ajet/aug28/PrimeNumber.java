package com.ajet.aug28;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("asdfasd "+solve(5));
    }
        public static int solve(int A) {
            int n = A/2;
            int i;
            boolean prime = false;
            for(i = 2; i <= n; i++) {
                if(0 == A % i) {
                    prime = true;
                    break;
                }
            }
            if(prime) {
                return 0;
            } else
                return 1;
        }

}
