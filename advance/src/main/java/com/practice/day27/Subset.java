package com.practice.day27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * @author prakashponali
 * @Date 19/10/23
 */
public class Subset {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        list =  new ArrayList<>(new LinkedHashSet<>(list)) ;
        Collections.sort(list);
        System.out.println(list);
        System.out.println(subsets(list));

    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        arrayLists.add(new ArrayList<>());
        subsets(A, 0, arrayLists, new ArrayList<>());
        return arrayLists;
    }

    public static void subsets(
            ArrayList<Integer> A, int index,
            ArrayList<ArrayList<Integer>> arrayLists, ArrayList<Integer> currentList){
        if(index == A.size()){

            return;
        }




        currentList.add(A.get(index));
        arrayLists.add(new ArrayList<>(currentList));
        subsets(A, index + 1, arrayLists, currentList);
        currentList.remove(currentList.size() - 1);


        subsets(A, index + 1, arrayLists, currentList);






    }
}
