package com.practice.module6.day50;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@Slf4j
class QueueTest {

    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue(2);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void enqueue() {
        queue.enqueue(5);
        display();
    }

    @Test
    void dequeue() {
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        display();
    }

    public void display(){
        while(!queue.isEmpty())
        log.info("Element in the queue {}", queue.dequeue());
    }
}