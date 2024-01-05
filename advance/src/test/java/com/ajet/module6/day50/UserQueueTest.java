package com.ajet.module6.day50;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author prakashponali (@pponali)
 * @Date 20/12/23
 * @Description :
 */

@Slf4j
class UserQueueTest {

    UserQueue<Integer> userQueue;

    @BeforeEach
    void setUp() {
        userQueue = new UserQueue<>();
    }

    @AfterEach
    void tearDown() {
        userQueue = null;
        System.gc();
    }

    @Test
    void push() {
        userQueue.push(8);
        userQueue.push(14);
        userQueue.push(9);
        userQueue.push(20);
        userQueue.pop();
        userQueue.push(30);
        log.info("Peek element {}", userQueue.peek());
        userQueue.pop();
        log.info("Peek element {}", userQueue.peek());
        log.info("Peek element {}", userQueue.rear());
        userQueue.push(60);
        userQueue.pop();
        userQueue.push(5);
        userQueue.push(10);
        log.info("Peek element {}", userQueue.peek());
        log.info("Peek element {}", userQueue.rear());

    }

    @Test
    void pop() {
        userQueue.pop();
        log.info("Peek element {}", userQueue.peek());
        log.info("Peek element {}", userQueue.rear());
    }

    @Test
    void peek() {
        log.info("Peek element {}", userQueue.peek());
    }

    @Test
    void rear() {
        log.info("Rear element {}", userQueue.rear());
    }

    @Test
    void empty() {
        log.info("Peek element {}", userQueue.peek());
        log.info("Rear element {}", userQueue.rear());
        log.info("empty element {}", userQueue.empty());
    }
}