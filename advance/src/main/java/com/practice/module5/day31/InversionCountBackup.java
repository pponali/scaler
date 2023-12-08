package com.practice.module5.day31;

/**
 * @author prakashponali
 * @Date 27/10/23
 */
public class InversionCountBackup {

    public static void main(String[] args) {
        System.out.println(inversionCount(new int[]{3,1,2,4}));
    }
    public static  int inversionCount(int[] A){
        int inversionCount = 0;
        for(int i = 1; i < A.length; i++){
            int j = i - 1; int current = A[i];
            while(j >= 0 && A[j] < current){
                A[j + 1] = A[j];
                inversionCount ++;
                j--;
            }
            A[j+1] = current;
        }
        return inversionCount;
    }
}
