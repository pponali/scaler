package com.practice.day27;

/**
 * @author prakashponali
 * @Date 19/10/23
 */
public class KthSymbolOptimized {

    public static void main(String[] args) {
        System.out.println(solve(50,99L));
    }
    public static int solve(int A, Long B) {
        if(kthBit(A, B)){
            return 1;
        } else {
            return 0;
        }
    }

    //Construct a binary tree with 1's and 0's
    //Here parent is previous row the means
    //Current row - 1 Ex: A-1
    //parent position is half of the current index. Ex: B/2
    public static boolean kthBit(int A, Long B){

        if(B == 0){
            return false;
        }
        //all even indexes are same as its parent index postion

        if(B % 2 == 0){
            return kthBit(A - 1, B/2);
        }
        //all odd indexes are opp to its parent index value
        else {
            return !kthBit(A - 1, B/2);
        }
    }
}

