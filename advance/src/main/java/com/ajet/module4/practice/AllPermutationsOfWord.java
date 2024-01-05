package com.ajet.module4.practice;

import java.util.ArrayList;

/**
 * @Author prakashponali
 * @Date 12/11/23
 * @Description
 */
public class AllPermutationsOfWord {

    public static void main(String[] args) {
        String string = "cdrp";
        ArrayList<String> finalList = new ArrayList<>();
        generatePermutations(string.toCharArray(), 0, finalList);
        System.out.println(finalList);
    }
    public static void generatePermutations(char[] chars, int idx, ArrayList<String> list){

        if(idx == chars.length - 1){
            list.add(new String(chars));
            return;
        }
        for(int i = idx; i < chars.length; i++){
            swap(chars, idx, i);
            generatePermutations(chars, idx+1, list);
            swap(chars, idx, i);
        }


    }

    public static void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}

