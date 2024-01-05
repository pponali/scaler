package com.ajet.module6.day48.additional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 09/12/23
 * @Description
 */
class InfixToPostfixTest {

    InfixToPostfix infixToPostfix;

    @BeforeEach
    void setUp() {
        infixToPostfix = new InfixToPostfix();
    }

    @AfterEach
    void tearDown() {
        infixToPostfix = null;
        System.gc();
    }

    @Test
    void solve() {
        assertEquals("abcd^e-fgh*+^*+i-", infixToPostfix.solve("a+b*(c^d-e)^(f+g*h)-i"));
    }
}