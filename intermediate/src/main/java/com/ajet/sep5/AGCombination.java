package com.ajet.sep5;

public class AGCombination {

    public static void main(String[] args) {
        System.out.println(agCombination("GGGTGANAGGJGAG"));
    }

    public static int agCombination(String A) {
        int stringLength = A.length();
        int[] count_G = new int[stringLength];
        int count = 0;
        //suffix sum
        for (int i = stringLength - 1; i >= 0; i--) {
            if(A.charAt(i) == 'G')
                count++;
            count_G[i] = count;
        }

        int agCombination = 0;
        for(int i = 0; i < stringLength - 1; i++) {
            if(A.charAt(i) == 'A') {
                agCombination += count_G[i];
            }
        }
        return agCombination;
    }
}
