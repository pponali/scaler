package com.practice.day27;

import java.util.ArrayList;

/**
 * @Author prakashponali
 * @Date 12/11/23
 * @Description
 */
public class AllPermutationsOfWord {
    public static void main(String[] args) {
        char[] chars = new char[]{'c','d','r','p'};
        System.out.println(generatePermutations(chars, 0 , new ArrayList<String>(), "cdrasdfasdf asdfadsf"));
        AllPermutationsOfWord allPermutationsOfWord = new AllPermutationsOfWord();
        allPermutationsOfWord.allPermutationsOfWord(new ArrayList<>(new ArrayList<>()), null, 0, "asdfadsfasd", "fas");
    }

    public void allPermutationsOfWord(ArrayList<ArrayList<String>> finalList, ArrayList<String> currentString, int idx, String context, String searchTerm){
        if(idx == searchTerm.length()){
            finalList.add(currentString);
            return;
        }



    }

    public static boolean generatePermutations(char[] chars, int idx, ArrayList<String > list, String searchContext){
        if(idx == chars.length - 1){
            list.add(new String(chars));
            System.out.println(list);
            return searchContext.contains(new String(chars));
        }
        boolean found = false;
        for(int i = idx; i < chars.length; i++){
            swap(chars, idx, i);
            found = found || generatePermutations(chars, idx+1, list, searchContext);
            swap(chars, idx, i);
        }
        return found;
    }


    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
