package com.ajet.module7.day59;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   08/01/24 2:00 pm
 */
class CustomHeapTest {

    public CustomHeap<Integer> customHeap;

    @BeforeEach
    void setUp() {
        customHeap = new CustomHeap<>();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void insert() {
        customHeap.insert(8);
        customHeap.insert(1);
        customHeap.insert(2);
        customHeap.insert(3);
        customHeap.insert(4);
        customHeap.insert(7);
        customHeap.display();
    }

    @Test
    void deleteMin() {
        customHeap.insert(8);
        customHeap.insert(1);
        customHeap.insert(2);
        customHeap.insert(3);
        customHeap.insert(4);
        customHeap.insert(7);
        customHeap.deleteMin();
        customHeap.display();
    }

    @Test
    void getMin() {
    }


    @Test
    void insertElement() {
    }

    @Test
    void deleteMinElement() {
    }
}