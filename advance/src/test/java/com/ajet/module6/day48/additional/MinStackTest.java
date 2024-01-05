package com.ajet.module6.day48.additional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 09/12/23
 * @Description
 */

@Slf4j
class MinStackTest {
    
    
    @Test
    public void fullTest(){
        minStack.push(10); //P 10
        minStack.push(9); //P 9
        minStack.getMin(); //g
        minStack.push(8); //P 8
        minStack.getMin(); //g
        minStack.push(7);  //P 7
        minStack.getMin(); //g
        minStack.push(6); //P 6   //P 10 P 9 g P 8 g P 7 g P 6 
        minStack.getMin(); //g        // g p g p g p g p g p g
        minStack.pop(); //p
        minStack.getMin(); //g
        minStack.pop(); //p
        minStack.getMin(); //g
        minStack.pop(); //p
        minStack.getMin(); //g
        minStack.pop(); //p
        minStack.getMin(); //g
        minStack.pop(); //p
        minStack.getMin(); //g
        MinStack.ListNode head = minStack.head;
        if(head == null){
            log.info("Head is null");
        } else {
            log.info("value is head " + head.val);
        }


    }        
    MinStack minStack = null;


    @BeforeEach
    void setUp() {
        minStack = new MinStack();
    }

    @AfterEach
    void tearDown() {
        minStack = null;
        System.gc();
    }

    @Test
    void push() {
        minStack.push(10);
        assertEquals(10,minStack.top());
    }

    @Test
    void pop() {
        minStack.push(10);
        minStack.pop();
        assertEquals(-1,minStack.top());
    }

    @Test
    void top() {

        minStack.push(10); //P 10
        minStack.push(9); //P 9
        minStack.getMin(); //g
        minStack.push(8); //P 8
        minStack.getMin(); //g
        minStack.push(7);  //P 7
        minStack.getMin(); //g
        minStack.push(6); //P 6
        assertEquals(6, minStack.top());

    }

    @Test
    void getMin() {
        minStack.push(10); //P 10
        minStack.push(2); //P 9
        minStack.getMin(); //g
        minStack.push(8); //P 8
        minStack.getMin(); //g
        minStack.push(7);  //P 7
        minStack.getMin(); //g
        minStack.push(6); //P 6
        assertEquals(2, minStack.getMin());
    }
}