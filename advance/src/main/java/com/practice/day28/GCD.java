package com.practice.day28;

/**
 * @author prakashponali
 * @Date 20/10/23
 */
public class GCD {

    public static void main(String[] args) {
        System.out.println(gcd(24, 16));
        System.out.println(gcd(6816621, 8157697));

        System.out.println(6816621 % 111241);
        System.out.println(8157697 % 111241);
    }

    public static  int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
