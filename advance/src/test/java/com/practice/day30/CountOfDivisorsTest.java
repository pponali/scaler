package com.practice.day30;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author prakashponali
 * @Date 04/12/23
 * @Description
 */

@Slf4j
class CountOfDivisorsTest {

    CountOfDivisors countOfDivisors;
    @BeforeEach
    void setUp() {
        countOfDivisors = new CountOfDivisors();
    }

    @AfterEach
    void tearDown() {
        countOfDivisors = null;
        System.gc();
    }

    @Test
    void isPrime() {
        assertFalse(CountOfDivisors.isPrime(10));
    }

    @Test
    void howManyPrimeNumber() {
        CountOfDivisors.howManyPrimeNumber(4);
    }

    @Test
    void printPrimeNumbers() {
        CountOfDivisors.printPrimeNumbers(3, 4);
    }

    @Test
    void smallestPrimeFactorInTheRange() {
        countOfDivisors.smallestPrimeFactorInTheRange(23);
    }

    @Test
    void smallestPrimeFactor() {
    }

    @Test
    void numberOfFactors() {
    }

    @Test
    void numberOfFactorsForNumber() {
    }

    @Test
    void solve() {
    }

    @Test
    void smallestPrimeFactor1() {
    }
}