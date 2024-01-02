package com.practice.module6.day50;

import java.util.LinkedList;

/**
 * @Author prakashponali (@pponali)
 * @Date 21/12/23 9:02 am
 * @Description :
 */
public class QueueLinkedList<E> {

    LinkedList<E> linkedList;

    public QueueLinkedList(){
        linkedList= new LinkedList<>();
    }

    public E peek(){
        return linkedList.getLast();
    }

    public E rear(){
        return linkedList.getFirst();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    public E dequeue(){
        return linkedList.removeLast();
    }

    public void enqueue(E e){
        linkedList.addFirst(e);
    }

}
