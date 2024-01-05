package com.ajet.module4.day28.additional;

/**
 * @author prakashponali
 * @Date 23/10/23
 * <p>
 * Problem Description Scooby has 3 three integers A, B, and C.
 * <p>
 * Scooby calls a positive integer special if it is divisible by B and it is divisible by C. You need to tell the number
 * of special integers less than or equal to A.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= A, B, C <= 109
 * <p>
 * <p>
 * <p>
 * Input Format First argument is a positive integer A Second argument is a positive integer B Third argument is a
 * positive integer C
 * <p>
 * <p>
 * <p>
 * Output Format One integer corresponding to the number of special integers less than or equal to A.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = 12 B = 3 C = 2 Input 2:
 * <p>
 * A = 6 B = 1 C = 4
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 2 Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * The two integers divisible by 2 and 3 and less than or equal to 12 are 6,12. Explanation 2:
 * <p>
 * Only 4 is a positive integer less than equal to 6 which is divisible by 1 and 4.
 */
public class DivisorGame {
    public static void main(String[] args) {

        int A = 24, B = 3, C = 4;
        System.out.println(divisorGame(A, B, C));


    }

    private static int divisorGame(final int A, final int B, final int C) {
        int lcm = (A * B) / gcd(A, B);
        while (lcm > 0 && lcm % C != 0) {
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
