package com.ajet.module4.day23.additional;

public class Print_A_to_1_function {
    public static void main(String[] args) {
        print_A_to_1_function(25);
    }

    public static void print_A_to_1_function(int A){
       System.out.print(A + " ");
        if(A == 1){
            return;
        }
        print_A_to_1_function(A - 1);
    }
}
