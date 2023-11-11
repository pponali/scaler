package com.practice.day27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * @author prakashponali
 * @Date 19/10/23 Problem Description Given a set of distinct integers A, return all possible subsets.
 * <p>
 * NOTE:
 * <p>
 * Elements in a subset must be in non-descending order. The solution set must not contain duplicate subsets. Also, the
 * subsets should be sorted in ascending ( lexicographic ) order. The initial list is not necessarily sorted.
 * <p>
 * <p>
 * Problem Constraints 1 <= |A| <= 16 INTMIN <= A[i] <= INTMAX
 * <p>
 * <p>
 * Input Format First and only argument of input contains a single integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format Return a vector of vectors denoting the answer.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = [1] Input 2:
 * <p>
 * A = [1, 2, 3]
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * [ [] [1] ] Output 2:
 * <p>
 * [ [] [1] [1, 2] [1, 2, 3] [1, 3] [2] [2, 3] [3] ]
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * You can see that these are all possible subsets. Explanation 2:
 * <p>
 * You can see that these are all possible subsets.
 */
public class Subset {

    public static int counter = 0;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        list = new ArrayList<>(new LinkedHashSet<>(list));
        Collections.sort(list);
        System.out.println(list);
        System.out.println(subsets(list));

    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        arrayLists.add(new ArrayList<>());
        A = new ArrayList<>(new LinkedHashSet<>(A));
        Collections.sort(A);
        subsets(A, 0, arrayLists, new ArrayList<>());
        return arrayLists;
    }

    public static void subsets(
            ArrayList<Integer> A, int index,
            ArrayList<ArrayList<Integer>> arrayLists, ArrayList<Integer> currentList) {
        if (index == A.size()) {
            Collections.sort(currentList);
            return;
        }


        currentList.add(A.get(index));
        arrayLists.add(new ArrayList<>(currentList));
        System.out.println(counter++ + "   " + currentList);
        subsets(A, index + 1, arrayLists, currentList);
        currentList.remove(currentList.size() - 1);

        subsets(A, index + 1, arrayLists, currentList);


    }
}
