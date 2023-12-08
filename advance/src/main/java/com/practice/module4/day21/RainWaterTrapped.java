package com.practice.module4.day21;

/**
 * @author prakashponali
 * @Date 05/10/23
 */
public class RainWaterTrapped {
    public static void main(String[] args) {

        int[] arr = {56,6,52,43,23,47,48,38,96,46,30,66,80,15,62};
        RainWaterTrapped rainWaterTrapped = new RainWaterTrapped();
        rainWaterTrapped.trap(arr);


    }

    private int trap(final int[] A) {


        int[] Lprefix = new int[A.length];
        int[] Rprefix = new int[A.length];
        Lprefix[0] = A[0];
        for(int i =1; i < A.length; i++){
            Lprefix[i] = Math.max(Lprefix[i - 1], A[i]);
        }
        Rprefix[A.length - 1] = A[A.length - 1];
        for(int i =A.length - 2; i >= 0; i--){
            Rprefix[i] = Math.max(Rprefix[i + 1], A[i]);
        }
        int unitsOfWater = 0;
        for(int i = 1; i < A.length - 1; i++){
            unitsOfWater += Math.min(Lprefix[i], Rprefix[i]) - A[i];
        }
        return unitsOfWater;



    }


}
