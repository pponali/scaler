package com.ajet.module6.day49.additional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 11/12/23
 * @Description
 */
class NextGreaterTest {
    NextGreater nextGreater;
    @BeforeEach
    void setUp() {
        nextGreater = new NextGreater();
    }

    @AfterEach
    void tearDown() {
        nextGreater = null;
        System.gc();
    }

    @Test
    void nextGreater() {
        assertArrayEquals(new int[]{-1},nextGreater.nextGreater(new int[]{1}));
    }
}