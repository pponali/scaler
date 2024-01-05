package com.ajet.module6.day50;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


@Slf4j
class PerfectNumbersTest {


    PerfectNumbers perfectNumbers;

    @BeforeEach
    void setUp() {
        perfectNumbers = new PerfectNumbers();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void perfectNumber() {
        log.info("Perfect number at {} is {}", 5, perfectNumbers.perfectNumber(5));
    }
}