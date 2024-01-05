package com.ajet.module6.day48;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 08/12/23
 * @Description
 */

@Slf4j
class EvaluateExpressionTest {

    EvaluateExpression stack;
    @BeforeEach
    void setUp() {
        stack = new EvaluateExpression();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void evalRPN() {
        String[] strs = new String[]{"2", "1", "+", "3", "*"};
        assertEquals(9, stack.evalRPN(strs));
    }

    @Test
    void evalRPNTest() {
        String[] strs = new String[]{"4","13","5","/","+"};
        assertEquals(6, stack.evalRPN(strs));
    }
}