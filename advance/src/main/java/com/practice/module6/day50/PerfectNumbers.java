package com.practice.module6.day50;

/**
 * @Author prakashponali (@pponali)
 * @Date 20/12/23 5:35 pm
 * @Description :
 * <p></p>
 * Given an integer A, you have to find the Ath Perfect Number.
 *<p></p>
 * A Perfect Number has the following properties:
 *<p></p>
 * It comprises only 1 and 2.
 * The number of digits in a Perfect number is even.
 * It is a palindrome number.
 * For example, 11, 22, 112211 are Perfect numbers, where 123, 121, 782, 1 are not.
 *<p></p>
 *
 *
 * Problem Constraints
 * 1 <= A <= 100000
 *<p></p>
 *
 *
 * Input Format
 * The only argument given is an integer A.
 *<p></p>
 *
 *
 * Output Format
 * Return a string that denotes the Ath Perfect Number.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *  A = 2
 * Input 2:
 *<p></p>
 *  A = 3
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  22
 * Output 2:
 *<p></p>
 *  1111
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 * First four perfect numbers are:
 * 1. 11
 * 2. 22
 * 3. 1111
 * 4. 1221
 * Return the 2nd Perfect number.
 * Explanation 2:
 *<p></p>
 * First four perfect numbers are:
 * 1. 11
 * 2. 22
 * 3. 1111
 * 4. 1221
 * Return the 3rd Perfect number.
 */
public class PerfectNumbers {

    public int perfectNumber(int A){
        Queue<String> q = new Queue<>(5);
        q.enqueue("1");
        q.enqueue("2");
        String frant = "0";
        for (int i = 1; i < A; i++){
            frant = q.front();
            q.dequeue();
            q.enqueue(frant + "1");
            q.enqueue(frant + "2");
        }
        StringBuilder sb = new StringBuilder(frant);
        return Integer.parseInt(frant + sb.reverse());
    }



}
