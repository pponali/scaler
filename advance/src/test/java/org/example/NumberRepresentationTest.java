package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description
 */
class NumberRepresentationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }

    @Test
    void numberRepresentationWithSumOfConsecutiveNumbers() {
        assertNotEquals(2, NumberRepresentation.numberRepresentationWithSumOfConsecutiveNumbers(9));
    }
}