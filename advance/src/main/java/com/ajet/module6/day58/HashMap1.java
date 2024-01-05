package com.ajet.module6.day58;

import java.util.LinkedList;

public class HashMap1<K, V> {

    public class HashMapNode<K,V>{
        private K key;
        private V value;

        public HashMapNode(K key, V value){
            this.key = key;
            this.value = value;
        }
    }


    private LinkedList<HashMapNode> buckets[];
    private int size;

    public HashMap1(){
        buckets = new LinkedList[4];
        size = 0;
    }


    public void put(K key, V value){
        //nt

    }

}
