package com.ajet.oct1;

import com.ajet.sort.InsertionSort;

import java.util.Arrays;


//next permuation
public class NextPermutation {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextPermutation(new int[]{626, 436, 819, 100, 382, 173, 817, 581, 220,
                95, 814, 660, 397, 852, 15, 532, 564, 715, 179, 872, 236, 790, 223, 379, 83, 924, 454, 846, 742,
                730, 689, 112, 110, 516, 85, 149, 228, 202, 988, 212, 69, 602, 887, 445, 327, 527, 347, 906, 54,
                460, 517, 376, 395, 494, 827, 448, 919, 799, 133, 879, 709, 184, 812, 514, 976, 700, 156, 568, 453,
                267, 547, 8, 951, 326, 652, 772, 213, 714, 706, 972, 318, 768, 506, 59, 854, 422})));
    }

    public static int[] nextPermutation(int[] A) {
        if(A.length == 1){
            return A;
        }
        int current_start = A[A.length - 2], min;
        boolean swap = false;
        for(int i = A.length - 1 ; i > 0 ; i--) {
            if(current_start < A[i]){
                int minIndex = 0;
                if(i + 1 < A.length){
                    min = A[i + 1];
                    minIndex = i + 1;
                } else {
                    min = A[i];
                    minIndex = i;
                }
                for(int j = i + 1; j < A.length; j++){
                    if(min < A[j]) {
                        min = A[j];
                        minIndex = j;
                    }
                }
                if(A[i - 1] < A[minIndex]) {
                    int temp = A[i - 1];
                    A[i - 1] = A[minIndex];
                    A[minIndex] = temp;
                } else {
                    int temp = A[i - 1];
                    A[i - 1] = A[i];
                    A[i] = temp;
                }


                swap = true;
                reverse(A, i, A.length -1);
                break;
            }

        }
        if(!swap){
            InsertionSort.insertionSort(A);
        }


        return A;
    }

    public static int[] reverse(int[] A, int a, int b) {
        int i = a, j = b, temp;
        for(; i < j; i++, j--){
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }
}
