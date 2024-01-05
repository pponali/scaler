package com.ajet.module4.day21;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 05/10/23
 */
public class AddOneNumber {
    public static void main(String[] args) {
        AddOneNumber addOneNumber = new AddOneNumber();
        int[] nums = {0,3,7,6,4,0,5,5,5};
        System.out.println(Arrays.toString(addOneNumber.plusOne(nums)));
    }

    private int[] plusOne(final int[] A) {
        ArrayList<Integer> finalList = new ArrayList<>();
        A[A.length - 1] = A[A.length - 1] + 1;
        for(int i = A.length - 1; i >= 0; i-- ){
            if(i == 0 && A[i] == 0){
                continue;
            }
            if(A[i] > 9){
                int nthNumber = A[i] % (int) Math.pow(10, 1);
                finalList.add(nthNumber);
                if(i - 1 >= 0) {
                    A[i - 1] = A[i - 1] + (A[i] / 10);
                } else {
                    if(A[i] > 9) {
                        finalList.add(A[i] / 10);
                    }
                }

            } else{
                finalList.add(A[i]);
            }
        }
        int[] B = new int[finalList.size()];
        for(int i = finalList.size() - 1; i >= 0; i-- ){
            B[(finalList.size() - 1) - i] = finalList.get(i);
        }
        return B;
    }
}
