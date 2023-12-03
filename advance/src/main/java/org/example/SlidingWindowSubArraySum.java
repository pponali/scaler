package org.example;

/**
 * @Author prakashponali
 * @Date 02/12/23
 * @Description
 */
public class SlidingWindowSubArraySum

{

    public static void main(String[] args) {
        subarraySumOfSizeK(new int[]{1, 2, 3, 4, 5}, 3);

    }

    private static void subarraySumOfSizeK(int[] ints, int i) {
        int sum = 0;
        for(int j=0;j<i;j++){
            sum+=ints[j];
        }
        System.out.println(sum);
        for(int j=i;j<ints.length;j++) {
            sum += ints[j];
            sum -= ints[j - i];
            System.out.println(sum);
        }
        System.out.println(sum);


    }
}
