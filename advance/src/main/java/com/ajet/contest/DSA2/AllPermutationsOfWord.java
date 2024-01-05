package com.ajet.contest.DSA2;

import java.util.ArrayList;

/**
 * @Author prakashponali
 * @Date 12/11/23
 * @Description
 */
public class AllPermutationsOfWord {
    public static void main(String[] args) {
        char[] chars = new char[]{'c','d','r','p'};
        ArrayList<String> finalList = new ArrayList<>();
        generatePermutations(chars, 0 , finalList);
        System.out.println(finalList);
        AllPermutationsOfWord allPermutationsOfWord = new AllPermutationsOfWord();
        allPermutationsOfWord.allPermutationsOfWord(new ArrayList<>(new ArrayList<>()), null, 0, "asdfadsfasd", "fas");
    }

    public void allPermutationsOfWord(ArrayList<ArrayList<String>> finalList, ArrayList<String> currentString, int idx, String context, String searchTerm){
        if(idx == searchTerm.length()){
            finalList.add(currentString);
            return;
        }



    }

    public static void generatePermutations(char[] chars, int idx, ArrayList<String > list){
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


    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
