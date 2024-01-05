package com.ajet.module6.day50;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


@Slf4j
class QueueLinkedListTest {

    QueueLinkedList queueLinkedList;

    @BeforeEach
    void setUp() {
        queueLinkedList = new QueueLinkedList();
        queueLinkedList.enqueue(0);
        queueLinkedList.enqueue(1);
        queueLinkedList.enqueue(2);
        queueLinkedList.enqueue(3);
        queueLinkedList.enqueue(4);
        queueLinkedList.enqueue(5);
    }

    @AfterEach
    void tearDown() {
        queueLinkedList = null;
        System.gc();
    }

    @Test
    void peek() {
        log.info("Peek element in the Queue :: {}", queueLinkedList.peek());
    }

    @Test
    void rear() {
        log.info("Rear element in the Queue :: {}", queueLinkedList.rear());
    }

    @Test
    void isEmpty() {
        log.info("Queue status :: {}", queueLinkedList.isEmpty());
    }

    @Test
    void pop() {
        queueLinkedList.dequeue();
        queueLinkedList.dequeue();
        display();
    }

    @Test
    void push() {
        queueLinkedList.enqueue(10);
        queueLinkedList.enqueue(11);
        queueLinkedList.enqueue(12);
        queueLinkedList.enqueue(13);
        queueLinkedList.enqueue(14);
        queueLinkedList.enqueue(15);
        display();
    }

    public void display(){
        while(!queueLinkedList.isEmpty()){
            log.info("First element in the queue {}", queueLinkedList.dequeue());
        }
    }
}