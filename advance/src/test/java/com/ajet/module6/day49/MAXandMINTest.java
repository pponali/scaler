package com.ajet.module6.day49;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 11/12/23
 * @Description
 */
class MAXandMINTest {

    MAXandMIN maXandMIN;

    @BeforeEach
    void setUp() {
        maXandMIN = new MAXandMIN();
    }

    @AfterEach
    void tearDown() {
        maXandMIN = null;
        System.gc();
    }

    @Test
    void solve() {
        assertEquals(1362057, maXandMIN.solve(new int[]{992387,932142,971117,934674,988917,967890,948508,970347}));;
    }
}