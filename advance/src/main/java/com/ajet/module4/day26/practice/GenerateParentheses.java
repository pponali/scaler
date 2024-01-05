package com.ajet.module4.day26.practice;

import java.util.ArrayList;

public class GenerateParentheses {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        generateParentheses(6, "", 0, 0,list);
        System.out.println(list);
    }


    public static void generateParentheses(int length, String s, int left, int right, ArrayList<String> list){

        if(s.length() == length)
            list.add(s);


        if(left < length / 2){
            generateParentheses(length, s + "(", left + 1, right, list);
        }
        if(right < left) {
            generateParentheses(length, s + ")", left, right + 1, list);
        }
    }



}
