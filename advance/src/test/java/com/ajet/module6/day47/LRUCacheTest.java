package com.ajet.module6.day47;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   05/01/24 4:20 pm
 */
class LRUCacheTest {

    LRUCache<Integer> lruCache;




    @BeforeEach
    void setUp() {
        lruCache = new LRUCache<>(5);
        lruCache.set(10);
        lruCache.set(9);
        lruCache.set(12);
        lruCache.set(11);
        lruCache.set(14);
        lruCache.set(15);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void set() {
    }

    @Test
    void get() {
        assertEquals(10,  lruCache.get(10));
    }
}