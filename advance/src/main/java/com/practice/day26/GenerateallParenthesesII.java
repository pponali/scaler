package com.practice.day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author prakashponali
 * @Date 16/10/23
 */
public class GenerateallParenthesesII {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateParenthesis(3)));
    }

    public static String[] generateParenthesis(int A) {
        int left_br = 0, right_br = 0;
        String st = "";
        ArrayList<String> list = new ArrayList<String>();
        generateParenthesis(2*A, list, st, left_br, right_br);
        return list.stream().toArray(String[]::new);
    }

    public static void generateParenthesis(int length, ArrayList<String> list, String st, int left_br, int right_br){
        if(st.length() == length){
            list.add(st);
        }
        if(left_br < length/2){
            generateParenthesis(length, list, st + "(", left_br + 1, right_br);
        }

        if(right_br < left_br){
            generateParenthesis(length, list, st + ")", left_br, right_br + 1);
        }

    }
}
