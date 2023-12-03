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



    public static long numberRepresentationWithSumOfConsecutiveNumbers(int i) {
        //i should be represented with sum of consecutive numbers
        //we need to find how many sets of consecutive numbers are there like that
        long count = 0;
        for(int start=1; start<=i; start++){
            int currSum = start;
            for(int j=start+1; currSum<=i; j++){
                currSum += j;
            }
            if(currSum == i) count++;
        }
        return count;
    }
}
