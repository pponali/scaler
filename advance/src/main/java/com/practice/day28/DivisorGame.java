package com.practice.day28;

/**
 * @author prakashponali
 * @Date 23/10/23
 */
public class DivisorGame {
    public static void main(String[] args){

        int A = 2, B = 3, C = 4;
        System.out.println(divisorGame(A, B, C));



    }

    private static int divisorGame(final int A, final int B, final int C) {
        int lcm = (A * B) / gcd(A, B);
        while(lcm > 0 && lcm % C != 0){
            lcm = lcm - 1;
        }
            return lcm;
    }



    //euclidean theorem algorithm for gcd for two numbers
    // gcd(a,b) = gcd(b,a%b)
    // gcd(a,b,c) = gcd(b,c)
    // gcd(a,b,c,d) = gcd(b,d)
    // gcd(a,b,c,d,e) = gcd(b,e)
    // gcd(a,b,c,d,e,f) = gcd(b,f)
    // gcd(a,b,c,d,e,f,g) = gcd(b,g)
    // gcd(a,b,c,d,e,f,g,h) = gcd(b,h)
    // gcd(a,b,c,d,e,f,g,h,i) = gcd(b,i)
    // gcd(a,b,c,d,e,f,g,h,i,j) = gcd(b,j)
    // gcd(a,b,c,d,e,f,g,h,i,j,k) = gcd(b,k)
    // gcd(a,b,c,d,e,f,g,h,i,j,k,l) = gcd(b,l)
    // gcd(a,b,c,d,e,f,g,h,i,j,k,l,m) = gcd(b,m)
    // gcd(a,b,c,d,e,f,g,h,i,j,k,l,m,n) = gcd(b,n)
    // gcd(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o) = gcd(b,o)
    // gcd(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p) = gcd(b,p)

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a); // recursion
    }



    //algorithm for co-prime numbers

    // gcd(a,b) = 1
    // gcd(a,b,c) = 1
    // gcd(a,b,c,d) = 1
    // gcd(a,b,c,d,e) = 1
    // gcd(a,b,c,d,e,f) = 1
    // gcd(a,b,c,d,e,f,g) = 1
    // gcd(a,b,c,d,e,f,g,h) = 1
    // gcd(a,b,c,d,e,f,g,h,i) = 1
    // gcd(a,b,c,d,e,f,g,h,i,j) = 1
    // gcd(a,b,c,d,e,f,g,h,i,j,k) = 1
    // gcd(a,b,c,d,e,f,g,h,i,j,k,l) = 1
    public static boolean isCoprime(int a, int b) {
        return gcd(a, b) == 1; // recursion
    }

}
