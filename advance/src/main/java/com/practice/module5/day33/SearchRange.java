package com.practice.module5.day33;

import java.util.Arrays;

public class SearchRange {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, 10)));
    }

    public static  int[] searchRange(final int[] A, int B) {
        int l = 0, h = A.length - 1, m = 0;
        int[] a = new int[]{-1,-1};
        if(A.length == 1){
            a[0] = 0;
            a[1] = 0;
            return a;
        }
        while(l <= h){
            m = l + (h - m) /2;
            if(A[m] == B){
                if(A[m - 1] == B){
                    h = m - 1;
                } else {
                    a[0] = m;
                    break;
                }
            } else if(A[m] > B){
                h = m -1;
            } else{
                l = m + 1;
            }
        }
        l = 0; h = A.length - 1;
        while(l <= h){
            m = l + (h - m)/2;
            if(A[m] == B){
                if(m + 1 != A.length && A[m + 1] == B){
                    l = m + 1;
                } else {
                    a[1] = m;
                    break;
                }
            } else if(A[m] > B){
                h = m - 1;
            } else{
                l = m + 1;
            }
        }
        return a;
    }
}
