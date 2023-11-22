package com.practice.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description Akash likes playing with strings. One day he thought of applying following operations on the string in
 * the given order:
 * <p>
 * Concatenate the string with itself. Delete all the uppercase letters. Replace each vowel with '#'. You are given a
 * string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the
 * above operations.
 * <p>
 * NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1<=N<=100000
 * <p>
 * <p>
 * Input Format First argument is a string A of size N.
 * <p>
 * <p>
 * <p>
 * Output Format Return the resultant string.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1: A="aeiOUz" Input 2: A="AbcaZeoB"
 * <p>
 * <p>
 * Example Output Output 1: "###z###z" Output 2: "bc###bc###"
 * <p>
 * <p>
 * Example Explanation Explanatino 1: First concatenate the string with itself so string A becomes "aeiOUzaeiOUz".
 * Delete all the uppercase letters so string A becomes "aeizaeiz". Now replace vowel with '#', A becomes "###z###z".
 * Explanatino 2: First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB". Delete all the
 * uppercase letters so string A becomes "bcaeobcaeo". Now replace vowel with '#', A becomes "bc###bc###".
 */
public class String_operations {


    public static void main(String[] args) {
        String_operations stringOperations = new String_operations();
        System.out.println(stringOperations.stringOperations("asdfasdfASKKJJASDFASDkjfasjdkkjasdnjnjd"));
    }

    public String stringOperations(String A) {
        char[] chars = A.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char aChar : chars) {
            if (aChar >= 'A' && aChar <= 'Z') {
                continue;
            }
            if (aChar == 'a' || aChar == 'e' || aChar == 'i' || aChar == 'o' || aChar == 'u') {
                list.add('#');
            } else {
                list.add(aChar);
            }
        }

        String str = new String(Arrays.toString(list.toArray()));
        return str + str;
    }
}
