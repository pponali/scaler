package com.ajet.module2.day6.additional;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description
 */
public class Problems_on_1D_Arrays_2_MCQ_D {
    public static void main(String[] args) {
        //Problems_on_1D_Arrays_2_MCQ_D problemsOn1DArrays2McqD = new Problems_on_1D_Arrays_2_MCQ_D();
        int[] arr = new int[]{10,20,30,40,50};
        fun(arr);
        System.out.println(arr[3]);
    }

    static void fun(int[] arr){
        arr[3] = 98;
        return;
    }


}
