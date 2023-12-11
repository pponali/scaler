package com.practice.module6.day48;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 09/12/23
 * @Description
 */
class DoubleCharacterTroubleTest {

    DoubleCharacterTrouble doubleCharacterTrouble = null;



    @BeforeEach
    void setUp() {
        doubleCharacterTrouble = new DoubleCharacterTrouble();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void solve() {
        assertEquals("ac",doubleCharacterTrouble.solve("abccbc"));
    }

    @Test
    void solveaba() {
        assertEquals("acaba",doubleCharacterTrouble.solve("aba"));
    }

    @Test
    void solveaa() {
        assertEquals("",doubleCharacterTrouble.solve("aa"));
    }
}