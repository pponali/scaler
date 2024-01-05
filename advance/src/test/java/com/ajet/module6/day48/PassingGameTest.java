package com.ajet.module6.day48;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 08/12/23
 * @Description
 */
class PassingGameTest {

    PassingGame passingGame = null;

    @BeforeEach
    void setUp() {
        passingGame = new PassingGame(23);

    }

    @AfterEach
    void tearDown() {
        passingGame = null;
        System.gc();
    }

    @Test
    void passOne() {
        //passingGame.passOne(0);
        passingGame.passOne(86);
        passingGame.passOne(63);
        passingGame.passOne(60);
        passingGame.passOne(0);
        passingGame.passOne(47);
        passingGame.passOne(0);
        passingGame.passOne(99);
        passingGame.passOne(9);
        passingGame.passOne(0);
        passingGame.passOne(0);

        passingGame.printStatck(passingGame);
    }
}