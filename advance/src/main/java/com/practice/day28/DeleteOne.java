package com.practice.day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author prakashponali
 * @Date 20/10/23
 * <p>
 * Problem Description Given an integer array A of size N. You have to delete one element such that the GCD(Greatest
 * common divisor) of the remaining array is maximum.
 * <p>
 * Find the maximum value of GCD.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 2 <= N <= 105 1 <= A[i] <= 109
 * <p>
 * <p>
 * <p>
 * Input Format First argument is an integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format Return an integer denoting the maximum value of GCD.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = [12, 15, 18] Input 2:
 * <p>
 * A = [5, 15, 30]
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 6 Output 2:
 * <p>
 * 15
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * If you delete 12, gcd will be 3. If you delete 15, gcd will be 6. If you delete 18, gcd will 3. Maximum value of gcd
 * is 6. Explanation 2:
 * <p>
 * If you delete 5, gcd will be 15. If you delete 15, gcd will be 5. If you delete 30, gcd will be 5. Maximum value of
 * gcd is 15.
 */
public class DeleteOne {

    public static void main(String[] args) {
        int[] array = new int[]{208610688, 48106344, 135402124, 34168992, 95013776, 35218040, 117231114, 172905590, 66652014, 45970782, 222323244, 203402914, 35292972, 159829956, 154584716, 107190226, 71335264, 42786172, 203327982, 3484338, 28062034, 64179258, 210993, 94938844, 155858560, 123562868, 223447224, 116744056, 55711942, 88082566, 45671054, 16072914, 165299992, 136601036, 44659472, 219063702, 202953322, 188341582, 116931386, 127759060, 131318330, 49867246, 92278758, 40875406, 218314382, 135889182, 6893744, 97111872, 56236466, 96662280, 52340002, 195010530, 44884268, 167435554, 155746162, 201679478, 54138370, 103481092, 25814074, 186093622, 208498290, 31883566, 122101694, 128058788, 133566290, 55749408, 178675354, 186056156, 155071774, 35180574, 82050540, 7755462, 29448276, 100333948, 130156884, 67850926, 44509608, 17084496, 216703344, 197295956, 174479162, 18058612, 51290954, 173917172, 51815478, 218426780, 184032992, 148140564, 108951128};
        System.out.println(solve((ArrayList<Integer>) Arrays.stream(array).boxed().collect(Collectors.toList())));
    }


    public static int solve(ArrayList<Integer> A) {
        //A={24,16,18,30,15}
        //By deleting one item every time calculated the GCD for the remaining array elements
        //A={_,16,18,30,15}	= gcd = 1
        //A={24,_,18,30,15}	= gcd = 3
        //A={24,16,_,30,15}	= gcd = 1
        //A={24,16,18,_,15}	= gcd = 1
        //A={24,16,18,30,_}	= gcd = 2

        //Second entry will be having the largest value so after removing 16 we can get the height GCD for the remaining values.
        // Brute force calculating GCD for the remaining elements O(N^2) two loops needs to be iterated.

        //Instead do the prefix GCD that means GCD(A[i], A[i+1]) and suffix GCD(A[N-i], A[N-i+1])

        //	A={24,16,18,30,15}
        //prefixGCD={24,8,2,2,1}
        //suffixGCD={1,1,3,15,15}

        //prefix GCD
        ArrayList<Integer> prefixArray = new ArrayList<>();
        prefixArray.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            int gcd = gcd(A.get(i), prefixArray.get(i - 1));
            prefixArray.add(gcd);
        }


        ArrayList<Integer> suffixArray = new ArrayList<>();
        int[] Ab = new int[A.size()];
        Ab[A.size() - 1] = A.get(A.size() - 1);
        for (int i = A.size() - 2; i >= 0; i--) {
            Ab[i] = gcd(A.get(i), Ab[i + 1]);
        }
        for (int j : Ab) {
            suffixArray.add(j);
        }


        //for edge case
        // suffixArray.get(1) --> is if the first element is removed a[1] will the gcd of rest of the elements
        // prefixArray(prefixArray.size() - 2)) if  we removed the last element gcd of the rest of the elements is last but one.
        int ans = Math.max(suffixArray.get(1), prefixArray.get(prefixArray.size() - 2));
        //iterating for all the elements
        // to calculate GCD, we have to skip that index take the previous and next index for the current GCD.

        // max of all the GCDs
        int left;
        int right;
        int value;
        for (int i = 1; i < A.size() - 1; i++) {
            left = prefixArray.get(i - 1);
            right = suffixArray.get(i + 1);
            value = gcd(left, right);
            ans = Math.max(ans, value);
        }

        return ans;

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}


