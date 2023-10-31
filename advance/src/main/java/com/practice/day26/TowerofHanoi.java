package com.practice.day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author prakashponali
 * @Date 16/10/23
 */
public class TowerofHanoi {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(towerOfHanoi(3)));
    }
    public static int[][] towerOfHanoi(int A) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        towerOfHanoi(A, list, 1, 2, 3, A);
        return list.stream().map(x-> x.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);

    }

    public static void towerOfHanoi(int diskNumber, ArrayList<ArrayList<Integer>> list, int A, int B, int C, int length){
        if(diskNumber == 0) return;
        towerOfHanoi(diskNumber-1, list, A, C, B, length);
        ArrayList<Integer> counter = new ArrayList<Integer>();
        counter.add(diskNumber);
        counter.add(A);
        counter.add(C);
        list.add(counter);
        towerOfHanoi(diskNumber-1, list, B, A, C, length);

    }
}
