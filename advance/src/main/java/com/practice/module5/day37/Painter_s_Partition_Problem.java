package com.practice.module5.day37;

import java.util.ArrayList;

/**
 *
 */
public class Painter_s_Partition_Problem {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Painter_s_Partition_Problem painterSPartitionProblem = new Painter_s_Partition_Problem();
        int A = 1, B = 1000000;
        int[] C = new int[]{1000000,1000000};
        System.out.println(painterSPartitionProblem.paint(A, B, C));
    }

    /**
     *
     * @param A
     * @param B
     * @param C
     * @return
     */
    public int paint(int A, int B, int[] C) {
        long max = 0L; long sum=0L;
        for(int i = 0 ; i < C.length; i++){
            sum += C[i];
            max = Math.max(max, C[i]);
        }
        if(A >= C.length){
            return (int)max * B;
        }
        long l = max , h = sum, m = 0, ans = 0;
        while(l <= h){
            m = l + (h - l) /2;
            if(check(A, C, m)){
                ans = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return (int)(ans * B ) % 100000007;
    }
    public boolean check(int A, int[] C, long m){
        int s = 0, c = 1;
        for (int j : C) {
            s += j;
            if (s > m) {
                c++;
                s = j;
                if(c > A){
                    return false;
                }
            }
        }
        return true;
    }

    private static final int MOD = 10000003;

    public int paint(int A, int B, ArrayList< Integer > C) {

        long res = Long.MAX_VALUE;
        long low = 0;
        long high = Long.MAX_VALUE;
        long mid;

        while (low <= high) {
            mid = low + ((high - low) >> 1);
            boolean status = possible(A, B, C, mid);
            if (status) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int)(res % MOD);
    }

    private boolean possible(int A, int B, ArrayList < Integer > C, long time) {
        int n = C.size();
        int index = 0;
        long total;

        for (int i = 0; i < A && index < n; i++) {
            total = 0;
            while (total < time && index < n) {
                total += ((long) C.get(index) * B);
                if (total > time)
                    break;
                index++;
            }
        }
        if (index != n)
            return false;
        return true;
    }
}
