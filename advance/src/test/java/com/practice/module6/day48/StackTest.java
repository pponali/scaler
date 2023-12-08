package com.practice.module6.day48;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 08/12/23
 * @Description
 */
class StackTest {
    Stack stack = null;
    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @AfterEach
    void tearDown() {
        stack = null;
        System.gc();
    }

    @Test
    void push() {
        stack.push(10);
        stack.printStatck(stack);
    }

    @Test
    void pop() {
    }

    @Test
    void peak() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void size() {
    }
}