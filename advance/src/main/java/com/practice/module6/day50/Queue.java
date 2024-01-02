package com.practice.module6.day50;

public class Queue<E> {

    private E[] elements;
    private int size;
    private int front;
    private int rear;
    private int capacity;


    public Queue(int capacity){
        elements = (E[]) new Object[capacity];
    }

    public void enqueue(E element){
        if (isFull()) {
            resize();
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.elements[this.rear] = element;
        this.size = this.size + 1;
    }

    private void resize() {
        int newCapacity = this.capacity * 2;
        @SuppressWarnings("unchecked")
        E[] newArray = (E[]) new Object[newCapacity];

        for (int i = 0; i < this.size; i++) {
            newArray[i] = this.elements[(this.front + i) % this.capacity];
        }

        this.elements = newArray;
        this.front = 0;
        this.rear = this.size - 1;
        this.capacity = newCapacity;
    }

    public E dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }else{
            E temp = elements[front];
            front++;
            front = front % elements.length;
            size--;
            return temp;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == elements.length;
    }

    public E front(){
        return elements[front];
    }

    public E rear(){
        return elements[rear];
    }


}
