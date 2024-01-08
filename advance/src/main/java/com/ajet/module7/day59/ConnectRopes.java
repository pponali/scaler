package com.ajet.module7.day59;

import java.util.PriorityQueue;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   05/01/24 12:46 pm
 */
public class ConnectRopes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(minCost(arr));
    }

    private static int minCost(int[] arr) {
        int cost = 0;
        while (arr.length > 1) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            int min1Index = -1;
            int min2Index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min1) {
                    min2 = min1;
                    min2Index = min1Index;
                    min1 = arr[i];
                    min1Index = i;
                } else if (arr[i] < min2) {
                    min2 = arr[i];
                    min2Index = i;
                }
            }
            cost += min1 + min2;
            arr[min1Index] = min1 + min2;
            arr[min2Index] = Integer.MAX_VALUE;
            int[] temp = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != min1Index && i != min2Index) {
                    temp[j++] = arr[i];
                }
            }
            arr = temp;
            System.out.println(cost);
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        return cost;
    }

    public int connectRopes(int[] A) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < A.length; i++) {
            minHeap.add(A[i]);
        }
        int cost = 0;
        while(minHeap.size() > 1) {
            int min1 = minHeap.poll();
            int min2 = minHeap.poll();
            cost += min1 + min2;
            minHeap.add(min1 + min2);
        }
        return cost;
    }



}
