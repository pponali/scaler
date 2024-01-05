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
class NearestSmallerElementTest {


    NearestSmallerElement nearestSmallerElement;
    @BeforeEach
    void setUp() {
        nearestSmallerElement = new NearestSmallerElement();
    }

    @AfterEach
    void tearDown() {
        nearestSmallerElement = null;
        System.gc();
    }

    @Test
    void nearestSmallerElement() {
        assertArrayEquals(new int[]{-1, 4, -1, 2, 2},nearestSmallerElement.nearestSmallerElement(new int[]{4, 5, 2, 10, 8}));
    }
}