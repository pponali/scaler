package com.practice.day26;

/**
 * @author prakashponali
 * @Date 16/10/23
 */
public class KthSymbol {

    public static void main(String[] args) {
        System.out.println(solve(7,5 ));
    }

    public static  int solve(int A, int B) {
        return solve(A, B, 1, "0") - 48;
    }

    public static int solve(int A, int B, int row, String string){
        row = row + 1;
        string = string.replace("0", "X");
        string = string.replace("1", "10");
        string = string.replace("X", "01");

        if(row == A){
            return string.charAt(B);
        }


        return solve(A, B, row, string);
    }
}
