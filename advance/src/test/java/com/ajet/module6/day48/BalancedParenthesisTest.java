package com.ajet.module6.day48;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 08/12/23
 * @Description
 */
class BalancedParenthesisTest {

    BalancedParenthesis balancedParenthesis = null;
    @BeforeEach
    void setUp() {
        balancedParenthesis = new BalancedParenthesis();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void solve() {
        assertEquals(1, balancedParenthesis.solve("{([])}"));
    }

    @Test
    void solveTest1() {
        assertEquals(0, balancedParenthesis.solve("(){"));
    }

    @Test
    void solveTest2() {
        assertEquals(1, balancedParenthesis.solve("{([])}"));
    }


}