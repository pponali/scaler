package com.practice.day31;

/**
 * @author prakashponali
 * @Date 28/10/23
 */
public class InversionCount{

    public static void main(String[] args){
        System.out.println(inversionCount(new int[]{4,5,1,2,7,3}));
    }

    public static int inversionCount(int[] A){


        return mergeSort(A, 0, A.length - 1, 0);

    }

    public static int mergeSort(int[] A, int low, int high, int inversionCount){
        int leftInversionCount = 0, rightInversionCount = 0, recentCount = 0;
        if(low < high){
            int mid = (low + high) /2;

            leftInversionCount = mergeSort(A,low, mid, inversionCount);
            rightInversionCount = mergeSort(A, mid + 1, high, inversionCount);
            recentCount = merge(A, low, mid, high, inversionCount);
            System.out.println(leftInversionCount + " left count " + rightInversionCount + " right count " + recentCount );

        }

        return leftInversionCount + rightInversionCount + recentCount;

    }

    public static int merge(int[] A, int start, int mid, int end, int inversionCount){
        //System.out.println(start + " " + mid + " " + end + " " + inversionCount);
        int[] left = new int[mid - start + 1];
        int[] right = new int[end - mid];

        for(int i = 0; i < left.length;i++){
            left[i] = A[start + i];
        }
        for(int j = 0; j < right.length; j++){
            right[j] = A[mid + 1 + j];
        }
        int pointer1 = 0, pointer2 = 0, pointer3 = start;
        while(pointer1 < left.length && pointer2 < right.length){
            if(left[pointer1] > right[pointer2]){
                A[pointer3++] =  right[pointer2++];
                inversionCount += left.length - pointer1;
            } else {
                A[pointer3++] = left[pointer1++];
            }
        }
        while(pointer1 < left.length){
            A[pointer3++] = left[pointer1++];
        }
        while(pointer2 < right.length){
            A[pointer3++] = right[pointer2++];
        }

        return inversionCount;
    }

}
