package com.ajet.oct2;

public class NumberOfDigits1 {

    // find number of digit 1's less that N
    //count digit 1's in one's, ten's, hundred's, ....

    public static void main(String[] args) {
        System.out.println(" asdfa ======= " + countDigit1s(916));
        System.out.println(" asdfa ======= " + solve(916));
    }

    // bruteforce approach is to iterate from 1 to N and count the digit 1's
    public static int solve(int A) {
        int count = 0;
        for(int i = 1; i <= A; i++){
            count += countDigit(i, 1);
        }
        return count;
    }

    private static int countDigit(int i, int i1) {
        int count = 0;
        while(i > 0){
            if(i % 10 == i1){
                count++;
            }
            i = i/10;
        }
        return count;


    }


    // optimised approach is to iterate from 1 to N and count the digit 1's in one's, ten's, hundred's, ....
    //count digit 1's in one's, ten's, hundred's, ....
    // countDigit1s(916) = 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1
    // count the ones in the ones, tens, hundreds, ....
    // countDigit1s(916) = (916/1) * 1 + (916%1)
    // countDigit1s(916) = (916/10) * 10 + (916%10)
    // countDigit1s(916) = (916/100) * 100 + (916%100)
    // countDigit1s(916) = (916/1000) * 1000 + (916%1000)

    private static int countDigit1s(int n) {
        int count = 0;
        for(int i = 1; i <= n; i *= 10) {
            int divider = i * 10;
            count += (n / divider) * i + Math.min(Math.max(n % divider - (i - 1), 0), i);
        }
        return count;
    }

}
