package com.ajet.module4.day23;

public class Print_1_to_A_function {
    public static void main(String[] args) {
        print_1_to_A_function(14);
    }
    public static void print_1_to_A_function(int A){
        if(A == 0){
            return;
        }
        print_1_to_A_function(A - 1);
        System.out.println(A);
    }
}
