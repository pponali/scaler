package com.practice.module6.day49.additional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 11/12/23
 * @Description
 */
class SortStackUsingAnotherStackTest {
    SortStackUsingAnotherStack sortStackUsingAnotherStack;

    @BeforeEach
    void setUp() {
        sortStackUsingAnotherStack = new SortStackUsingAnotherStack();
    }

    @AfterEach
    void tearDown() {
        sortStackUsingAnotherStack = null;
        System.gc(); // Garbage Collector to clean up the memory.
        System.out.println("Memory Usage After Garbage Collection: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024 + " MB"); // Printing the memory usage after garbage collection.
        System.out.println("Memory Usage After Garbage Collection: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 + " KB"); // Printing the memory usage after garbage collection.
        System.out.println("Memory Usage After Garbage Collection: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) + " Bytes"); // Printing the memory usage after garbage collection.
        System.out.println("Memory Usage After Garbage Collection: " + Runtime.getRuntime().totalMemory() + " Bytes"); // Printing the memory usage after garbage collection.
        System.out.println("Memory Usage After Garbage Collection: " + Runtime.getRuntime().freeMemory() + " Bytes"); // Printing the memory usage after garbage collection.
    }

    @Test
    void sortStack() {
        assertArrayEquals(new int[]{5, 11, 17, 100}, sortStackUsingAnotherStack.sortStack(new int[]{5, 17, 100, 11}));
    }
}