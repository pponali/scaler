package com.practice.day12;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 */
public class Simple_Reverse {

    public static void main(String[] args) {
        Simple_Reverse simpleReverse = new Simple_Reverse();
        System.out.println(simpleReverse.simpleReverse("asdfasdfasdfhask**^&^$#%#%$%^$^&%jdfaiosdfjkasodifujasdfio"));

    }

    public String simpleReverse(String s){
        char[] chars = s.toCharArray();
        int l = 0, r = s.length() - 1;
        while(l < r){
            int temp = chars[l];
            chars[l] = chars[r];
            chars[r] = (char)temp;
            l++; r--;
        }
        return new String(chars);
    }
}
