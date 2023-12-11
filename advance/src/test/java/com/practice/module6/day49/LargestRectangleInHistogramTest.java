package com.practice.module6.day49;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 11/12/23
 * @Description
 *
 * Given an array of integers A.
 *
 * The value of an array is computed as the difference between the maximum element in the array and the minimum element in the array A.
 *
 * Calculate and return the sum of values of all possible subarrays of A modulo 109+7.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 *
 * 1 <= A[i] <= 1000000
 *
 *
 *
 * Input Format
 * The first and only argument given is the integer array A.
 *
 *
 *
 * Output Format
 * Return the sum of values of all possible subarrays of A modulo 109+7.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1]
 * Input 2:
 *
 *  A = [4, 7, 3, 8]
 *
 *
 * Example Output
 * Output 1:
 *
 *  0
 * Output 2:
 *
 *  26
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Only 1 subarray exists. Its value is 0.
 * Explanation 2:
 *
 * value ( [4] ) = 4 - 4 = 0
 * value ( [7] ) = 7 - 7 = 0
 * value ( [3] ) = 3 - 3 = 0
 * value ( [8] ) = 8 - 8 = 0
 * value ( [4, 7] ) = 7 - 4 = 3
 * value ( [7, 3] ) = 7 - 3 = 4
 * value ( [3, 8] ) = 8 - 3 = 5
 * value ( [4, 7, 3] ) = 7 - 3 = 4
 * value ( [7, 3, 8] ) = 8 - 3 = 5
 * value ( [4, 7, 3, 8] ) = 8 - 3 = 5
 * sum of values % 10^9+7 = 26
 */

@Slf4j
class LargestRectangleInHistogramTest {

    LargestRectangleInHistogram largestRectangleInHistogram;
    int[] heights = {2,1,5,6,2,3};
    int[] heights1 = {2,4};
    int[] heights2 = {2,1,2};
    int[] heights3 = {2,4,5,3,2,1};
    int[] heights4 = {2,1,2,3,4,5,6};
    int[] heights5 = {2,1,2,3,4,5,6,7};
    int[] heights6 = {2,1,2,3,4,5,6,7,8};
    int[] heights7 = {2,1,2,3,4,5,6,7,8,9};
    int[] heights8 = {2,1,2,3,4,5,6,7,8,9,10};
    int[] heights9 = {2,1,2,3,4,5,6,7,8,9,10,11};

    @BeforeEach
    void setUp() {
        largestRectangleInHistogram = new LargestRectangleInHistogram();
    }

    @AfterEach
    void tearDown() {
        largestRectangleInHistogram = null;
        heights = null;
        heights1 = null;
        heights2 = null;
        heights3 = null;
        heights4 = null;
        heights5 = null;
        heights6 = null;
        heights7 = null;
        heights8 = null;
        heights9 = null;
        log.info("Test Case Completed");
        log.info("===============================================");
        System.gc();
    }

    @Test
    void largestRectangleArea() {
        assertEquals(10,largestRectangleInHistogram.largestRectangleArea(heights));
    }
    @Test
    void largestRectangleArea1() {
        assertEquals(4,largestRectangleInHistogram.largestRectangleArea(heights1));
    }

    @Test
    void largestRectangleArea2() {
        assertEquals(3,largestRectangleInHistogram.largestRectangleArea(heights2));
    }

    @Test
    void largestRectangleArea3() {
        assertEquals(10,largestRectangleInHistogram.largestRectangleArea(heights3));
    }
    @Test
    void largestRectangleArea4() {
        assertEquals(12,largestRectangleInHistogram.largestRectangleArea(heights4));
    }
    @Test
    void largestRectangleArea5() {
        assertEquals(16,largestRectangleInHistogram.largestRectangleArea(heights5));
    }
    @Test
    void largestRectangleArea6() {
        assertEquals(20,largestRectangleInHistogram.largestRectangleArea(heights6));
    }
    @Test
    void largestRectangleArea7() {
        assertEquals(25,largestRectangleInHistogram.largestRectangleArea(heights7));
    }
    @Test
    void largestRectangleArea8() {
        assertEquals(30,largestRectangleInHistogram.largestRectangleArea(heights8));
    }
    @Test
    void largestRectangleArea9() {
        assertEquals(36,largestRectangleInHistogram.largestRectangleArea(heights9));
    }

    @Test
    void largestRectangleArea10() {
        assertNotEquals(100,largestRectangleInHistogram.largestRectangleArea(heights9));
    }
}