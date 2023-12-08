package com.practice.module6.day47;

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
public class LRUCache {

    int capacity;
    HashMap<Integer, ListNode> map = new HashMap<>();
    ListNode head;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new ListNode(-1);
        ListNode tail = new ListNode(-1);
        head.next = tail;
        tail.prev = head;
    }

    public void set(int key, int value){

    }

    public int get(int key){

        return 0;
    }

    public void setVal(int val){

    }

    public int getVal(int val){

        return 0;
    }

    public void setNode(ListNode node){

    }

    public ListNode getNode(ListNode node){

        return null;
    }

    public void setList(ListNode list){

    }

    public ListNode getList(ListNode list){

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


    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode prev;

        ListNode(int x) {
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
