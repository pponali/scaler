package com.ajet.module6.day48.additional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 09/12/23
 * @Description
 */

@Slf4j
class CheckTwoBracketExpressionsTest {

    CheckTwoBracketExpressions checkTwoBracketExpressions;

    @BeforeEach
    void setUp() {
        checkTwoBracketExpressions = new CheckTwoBracketExpressions();
    }

    @AfterEach
    void tearDown() {
        checkTwoBracketExpressions = null;
        System.gc();
    }

    @Test
    void normalizeString() {
        log.info(checkTwoBracketExpressions.simplifyExpression("-(a+b+c)"));

    }

    @Test
    void normalizeString1() {
        log.info(checkTwoBracketExpressions.simplifyExpression("-(-(-(-a+b)-d+c)-q)"));
        assertEquals(checkTwoBracketExpressions.simplifyExpression("-(-(-(-a+b)-d+c)-q)"), checkTwoBracketExpressions.simplifyExpression("a-b-d+c+q"));


    }

}