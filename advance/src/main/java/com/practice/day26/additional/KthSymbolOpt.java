package com.practice.day26.additional;

public class KthSymbolOpt {

    public static void main(String[] args) {
        System.out.println(KthSymbol(8));
    }
    public static boolean KthSymbol(int A){
        boolean currentValue = false;
        if(A == 0){
            return false;
        }
        if(A % 2 == 0){
            currentValue = KthSymbol(A/2);
            System.out.println("CCC if " + currentValue + " A " + A);
            return currentValue;
        } else {
            currentValue = !KthSymbol(A / 2);
            System.out.println("CCC else " + currentValue + " A " + A);
            return currentValue;
        }
    }
}
