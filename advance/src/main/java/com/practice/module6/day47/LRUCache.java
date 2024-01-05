package com.practice.module6.day47;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 07/12/23
 * @Description
 *
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.
 *<p></p>
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * set(key, value) - Set or insert the value if the key is not already present. When the cache reaches its capacity, it should invalidate the least recently used item before inserting the new item.
 * The LRUCache will be initialized with an integer corresponding to its capacity. Capacity indicates the maximum number of unique keys it can hold at a time.
 *<p></p>
 * Definition of "least recently used" : Access to an item is defined as a get or a set operation of the item. "Least recently used" item is the one with the oldest access time.
 *<p></p>
 * NOTE: If you are using any global variables, make sure to clear them in the constructor.
 *<p></p>
 * Example :
 *<p></p>
 * Input :
 *          capacity = 2
 *          set(1, 10)
 *          set(5, 12)
 *          get(5)        returns 12
 *          get(1)        returns 10
 *          get(10)       returns -1
 *          set(6, 14)    this pushes out key = 5 as LRU is full.
 *          get(5)        returns -1
 *
 */

@Slf4j
public class LRUCache<V> {

    int capacity;
    HashMap<V, ListNode<V>> map = new HashMap<>();
    ListNode<V> head;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new ListNode<>((V) new Integer(-1));
        ListNode<V> tail = new ListNode<V>((V) new Integer(-1));
        head.next = tail;
        tail.prev = head;
    }

    public void set(V value){
        if(map.containsKey(value)){
            remove(value);
        }
        addLast(value);
    }

    public void remove(V key){
        ListNode<V> node = map.get(key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = null;
        node.prev = null;
        map.remove(key);
    }

    public void deleteFirst(){
        ListNode<V> node = head.next;
        remove(node.val);
    }

    public void addLast(V value){
        ListNode<V> node = new ListNode<>(value);
        node.val = value;
        map.put(value, node);
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        if(map.size() > capacity){
            deleteFirst();
        }
    }

    public V get(V key){
        return map.get(key) != null ?  map.get(key).val : null;
    }

    public void setVal(int val){

    }

    public int getVal(int val){

        return 0;
    }

    public void setNode(ListNode<V> node){

    }

    public ListNode<V> getNode(ListNode<V> node){
        return null;
    }

    public void setList(ListNode<V> list){

    }

    public ListNode<V> getList(ListNode<V> list){

        return null;
    }

    public void setMap(int key, int val){

    }

    public int getMap(int key){

        return 0;
    }

    public void setKey(int val){

    }

    public int getKey(int val){

        return 0;
    }


    public static class ListNode<V> {
        public V val;
        public ListNode<V> next;
        public ListNode<V> prev;

        ListNode(V x) {
            val = x;
            next = null;
            prev = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }


}
