package com.practice.module4.day23;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "abccba";
        String s1 = "abcdcba";
        if(s1.length()%2 == 0){
            System.out.println(checkPalindrome(s1, (s.length() - 1 )/2, (s.length() - 1)/2 + 1));
        } else {
            System.out.println(checkPalindrome(s1, s.length()/2, s.length()/2));
        }
    }

    public static boolean checkPalindrome(String s, int left, int right){
        if(left == 0 || right == s.length() - 1){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            } else
                return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }

        return checkPalindrome(s, left-1, right+1);
    }
}
