package com.practice.sort;

import com.practice.day32.PairDiff;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description
 */
class PairDiffTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void solve() {
        // fail("Not yet implemented");
        int[] A = {3, 5, 1, 2};
        int B = 3;
        int expected = 2;
        int actual = new PairDiff().solve(A, B);
        assertNotEquals(expected, actual);
    }

    @Test
    void solve2() {
        // fail("Not yet implemented");
        int[] A = {1, 1, 1, 1};
        int B = 0;
        int expected = 1;
        int actual = new PairDiff().solve(A, B);
        assertEquals(expected, actual);
    }
}