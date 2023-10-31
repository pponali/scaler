package com.practice.day31;

import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 28/10/23
 */public class MinimuAbsoluteDifference{
    public static void main(String[] args){
        System.out.println(minimumAbsoluteDifference(new int[]{4,5,9,2,1,15}));
    }

    public static int minimumAbsoluteDifference(int[] A){
        return mergeSort(A, 0, A.length-1, Integer.MAX_VALUE);

    }

    public static int mergeSort(int[] A, int start, int end, int minimumAbsoluteDifference){

        if(start < end){
            int mid = (end + start) / 2;
            int leftDifference = mergeSort(A, start, mid, minimumAbsoluteDifference);
            int rightDifference = mergeSort(A, mid + 1, end, minimumAbsoluteDifference);

            int recentDifference = merge(A, start, mid, end, minimumAbsoluteDifference);
            int leftNright = Math.min(leftDifference, rightDifference);
            minimumAbsoluteDifference = Math.min(leftNright, recentDifference);

        }
        return minimumAbsoluteDifference;
    }

    public static int merge(int[] A, int start, int mid, int end, int minimumAbsoluteDifference){

        int[] left = new int[mid - start + 1];
        int[] right = new int[end - mid];
        for(int i = 0; i < left.length; i++) left[i] = A[start + i];
        for (int j = 0; j < right.length ; j++) {
            right[j] = A[mid + 1 + j];
        }
        int pointer1 = 0, pointer2 = 0, pointer3 = start;
        while(pointer1 < left.length && pointer2 < right.length){
            minimumAbsoluteDifference =  Math.min(minimumAbsoluteDifference, Math.abs(left[pointer1] - right[pointer2]));
            if(left[pointer1] > right[pointer2]){
                A[pointer3++] = right[pointer2++];
            } else{
                A[pointer3++] = left[pointer1++];
            }
        }
        while(pointer1 < left.length) A[pointer3++] = left[pointer1++];
        while(pointer2 < right.length) A[pointer3++] = right[pointer2++];
        return minimumAbsoluteDifference;
    }
}
