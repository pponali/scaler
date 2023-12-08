package com.practice.module4.day23;

/**
 * @author prakashponali
 * @Date 11/10/23
 */
public class PrintNNumbers {

    public static void main(String[] args) {
        solve(100);
    }
    public static void solve(int A) {
        print(A);
    }
    static int print(int A){
        int print;
        if(A == 1){
            print = 1;
        }  else{
            print = print(A-1) + 1;
        }
        System.out.print(print + " ");
        return print;
    }
}
