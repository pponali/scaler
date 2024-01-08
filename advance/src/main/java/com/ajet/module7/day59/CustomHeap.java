package com.ajet.module7.day59;

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
        while(parentIndex >= 0 && ((Comparable<E>)list.get(parentIndex)).compareTo(list.get(index)) > 0){
            E temp = list.get(parentIndex);
            list.set(parentIndex, list.get(index));
            list.set(index, temp);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    public void insertElement(E element){
        list.add(list.size(), element);
        int i = list.size() - 1;
        while(i > 0){
            int pi = (i - 1)/2;
            if(((Comparable<E>)list.get(pi)).compareTo(list.get(i)) > 0){
                E temp = list.get(pi);
                list.set(pi, list.get(i));
                list.set(i, temp);
                i = pi;
            } else {
                break;
            }
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

    public void deleteMinElement(){
        E temp = list.get(list.size() - 1);
        list.set(list.size() - 1, list.get(0));
        list.set(0, temp);
        list.remove(list.size() - 1);
        int i = 0;
        while(2 * i + 1 < list.size()){
            E x = null;
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (((Comparable) list.get(i)).compareTo(list.get(left)) < 0) {
                break;
            }
            int minindex = left;
            if(right < list.size() && ((Comparable) list.get(left)).compareTo(list.get(right)) < 0){
                minindex = right;
            }
            E t = list.get(minindex);
            list.set(minindex, list.get(i));
            list.set(i, t);
            i = minindex;
        }

    }

    public void display(){
        this.list.forEach(System.out::println);
    }

    public E getMin(){
        return list.get(0);
    }
}
