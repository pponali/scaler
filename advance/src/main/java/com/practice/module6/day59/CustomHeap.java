package com.practice.module6.day59;

import java.util.ArrayList;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   05/01/24 12:30 pm
 */
public class CustomHeap<E> {

    ArrayList<E> list = new ArrayList<>();

    public void insert(E element){
        list.add(element);
        int index = list.size() - 1;
        int parentIndex = (index - 1) / 2;
        while(parentIndex >= 0 && ((Comparable)list.get(parentIndex)).compareTo(list.get(index)) > 0){
            E temp = list.get(parentIndex);
            list.set(parentIndex, list.get(index));
            list.set(index, temp);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }
    public boolean isEmpty(){
        return false;
    }

    public int size(){
        return list.size();
    }

    public E remove(){
        return null;
    }

    public E peek(){
        return null;
    }

    public void deleteMin(){
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        int index = 0;
        while(2 * index + 1 < list.size()){
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int minIndex = left;
            if(right < list.size() && ((Comparable<E>)list.get(right)).compareTo(list.get(left)) < 0){
                minIndex = right;
            }
            if(((Comparable<E>)list.get(index)).compareTo(list.get(minIndex)) > 0){
                E temp = list.get(index);
                list.set(index, list.get(minIndex));
                list.set(minIndex, temp);
            }
            index = minIndex;
        }
    }

    public E getMin(){
        return list.get(0);
    }
}
