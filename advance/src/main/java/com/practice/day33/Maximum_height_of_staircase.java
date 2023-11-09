package com.practice.day33;

public class Maximum_height_of_staircase {

    public static void main(String[] args) {
        System.out.println(maximum_height_of_staircase(20));
    }

    private static int maximum_height_of_staircase(int A) {


        int l =1,m,h =A, ans = 0;
        int mod = 1000000007;
        while(l <= h){
            System.out.println();
            m = l + (h - l)/ 2;
            int mean = ((m % mod) * ((m + 1)/2) % mod) % mod ;
            if(mean <= A){
                ans = m;
                l = m + 1;
            } else {
                h = m -1;
            }
            System.out.println(" mid " + m + " start " + l + " high " + h);
        }
        return ans;

    }
}
