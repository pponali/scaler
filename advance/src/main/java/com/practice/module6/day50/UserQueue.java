package com.practice.module6.day50;

import java.util.Stack;

/**
 * @Author prakashponali (@pponali)
 * @Date 19/12/23
 * @Description :
 * <p></p>
 * Implement a First In First Out (FIFO) queue using stacks only.
 * <p></p>
 * The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
 * <p></p>
 * Implement the UserQueue class:
 * <p></p>
 * void push(int X): Pushes element X to the back of the queue.
 * int pop(): Removes the element from the front of the queue and returns it.
 * int peek(): Returns the element at the front of the queue.
 * boolean empty(): Returns true if the queue is empty, false otherwise.
 * NOTES:
 * <p></p>
 * You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and are empty operations are valid.
 * Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 * <p></p>
 * <p>
 * Problem Constraints
 * <p></p>
 * 1 <= X <= 109
 * <p></p>
 * At most, 1000 calls will be made to push, pop, peek, and empty function.
 * <p></p>
 * All the calls to pop and peek are valid. i.e., pop and peek are called only when the queue is non-empty.
 * <p></p>
 * <p>
 * <p>
 * Example Input
 * <p></p>
 * Input 1:
 * <p></p>
 * 1) UserQueue()
 * 2) push(20)
 * 3) empty()
 * 4) peek()
 * 5) pop()
 * 6) empty()
 * 7) push(30)
 * 8) peek()
 * 9) push(40)
 * 10) peek()
 * Input 2:
 * <p></p>
 * 1) UserQueue()
 * 2) push(10)
 * 3) push(20)
 * 4) push(30)
 * 5) pop()
 * 6) pop()
 * <p></p>
 * <p>
 * Example Output
 * <p></p>
 * Output 1:
 * <p></p>
 * false
 * 20
 * 20
 * true
 * 30
 * 30
 * Output 2:
 * <p></p>
 * 10
 * 20
 */
public class UserQueue<E> {
    /**
     * Initialize your data structure here.
     */
    Stack<E> firstStack = new Stack<>();
    Stack<E> secondStack = new Stack<>();


    /**
     * Push element X to the back of queue.
     */
    void push(E X) {
        firstStack.push(X);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    E pop() {
        if (!secondStack.isEmpty()) {
            return secondStack.pop();
        } else {
            while (!firstStack.isEmpty())
                secondStack.push(firstStack.pop());
            if (!secondStack.isEmpty())
                return secondStack.pop();
            else return null;
        }
    }

    /**
     * Get the front element of the queue.
     */
    E peek() {
        if (!secondStack.isEmpty()) {
            return secondStack.peek();
        } else {
            while (!firstStack.isEmpty())
                secondStack.push(firstStack.pop());
            if (secondStack.empty())
                return null;
            else
                return secondStack.peek();
        }
    }

    E rear() {
        if (!firstStack.empty()) {
            return firstStack.peek();
        } else {
            while (!secondStack.empty()) {
                firstStack.push(secondStack.pop());
            }
            if (firstStack.empty())
                return null;
            else return firstStack.peek();
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    boolean empty() {
        return secondStack.isEmpty() && firstStack.empty();
    }


}

/**
 * Your UserQueue object will be instantiated and called as such:
 * UserQueue obj = new UserQueue();
 * obj.push(X);
 * int param2 = obj.pop();
 * int param3 = obj.peek();
 * boolean param4 = obj.empty();
 */
