package com.practice.day30.practice;

/**
 * @Author prakashponali
 * @Date 11/11/23
 * @Description
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println(primeNumbers(10));
    }

    public static int primeNumbers(int A){
        boolean[] booleans = new boolean[A + 1];
        for(int i = 2; i * i < booleans.length; i++){
            if(booleans[i]){
                continue;
            }
            for (int j = i * i; j < booleans.length; j = j + i){
               if(!booleans[j]){
                   booleans[j] = true;
               }
            }
        }
        int count = 0;
        for(int i = 2; i < A; i++){
            if(!booleans[i]){
                count++;
            }
        }
        return  count;
    }
}
