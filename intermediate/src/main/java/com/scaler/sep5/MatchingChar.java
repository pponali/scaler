package com.scaler.sep5;

import java.util.HashSet;

public class MatchingChar {

    public static void main(String[] args) {
        System.out.println(matchingChars("abcd","abad"));
    }

    public static int matchingChars(String A, String B) {


        //str1 = abcd , str2=abad ,
        char[] s1 = A.toCharArray();
        char[] s2 = B.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char ch1 : s1) {
            for(char ch2 : s2) {
                if(ch1 == ch2 && !set.contains(ch2)) {
                    count++;
                    set.add(ch1);
                }
            }
        }
        return count;
    }
}
