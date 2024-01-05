package com.ajet.module4.day26.practice;

public class TowerOfHanoiPractice {

    public static void main(String[] args) {

        toh(4, 1,2,3);
    }

    public static void toh(int numberOfDisks, int S, int H, int D){

        if(numberOfDisks == 0) return;
        toh(numberOfDisks - 1, S, D, H);

        System.out.println(" S " + S + " H " + H + " D " + D);

        toh(numberOfDisks - 1, H, S, D);


    }
}
