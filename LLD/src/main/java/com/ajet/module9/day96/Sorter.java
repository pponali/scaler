package com.ajet.module9.day96;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   15/07/24 8:53 am
 */
public class Sorter implements Callable<ArrayList<Integer>> {
    private ArrayList<Integer> arr;
    private int low;
    private int high;

    public Sorter(ArrayList<Integer> arr, int low, int high) {
        this.arr = arr;
        this.low = low;
        this.high = high;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        //Base case
        if (low == high) {
            return new ArrayList<>(Arrays.asList(arr.get(low)));
        }
        int mid = (low + high) / 2;
        Sorter left = new Sorter(arr, low, mid);
        Sorter right = new Sorter(arr, mid + 1, high);
        left.call();
        right.call();
        arr = merge(arr, low, mid, high);
        return arr;

    }
    private ArrayList<Integer> merge(ArrayList<Integer> arr, int low, int mid, int high) {
        ArrayList<Integer> merged = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr.get(left) <= arr.get(right)) {
                merged.add(arr.get(left));
                left++;
            } else {
                merged.add(arr.get(right));
                right++;
            }
        }
        while (left <= mid) {
            merged.add(arr.get(left));
            left++;
        }
        while (right <= high) {
            merged.add(arr.get(right));
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr.set(i, merged.get(i - low));
        }
        return arr;
    }
}
