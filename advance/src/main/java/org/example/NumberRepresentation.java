package org.example;

/**
 * @Author prakashponali
 * @Date 02/12/23
 * @Description
 */
public class NumberRepresentation {
    public static void main(String[] args) {
        System.out.println(numberRepresentationWithSumOfConsecutiveNumbers(10));
    }



    private static boolean numberRepresentationWithSumOfConsecutiveNumbers(int i) {
        //i should be represented with sum of consecutive numbers
        int sum = 0;
        int n = i;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        if(sum==i){

        }


        return false;

    }
}
