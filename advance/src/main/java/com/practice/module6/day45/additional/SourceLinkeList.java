package com.practice.module6.day45.additional;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description
 */
public class SourceLinkeList {

    static class node {
        int data;
        node next;
        public node() {
            this.data = 0;
            this.next = null;
        }
    }
    static node root = null;
    static int size_of_ll = 0;
    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        if (position >= 1 && position <= size_of_ll + 1) {
            node temp = new node();
            temp.data = value;
            // insert at head
            if (position == 1) {
                temp.next = root;
                root = temp;
            } else {
                int count = 1;
                node prev = root;
                // traverse till the previous node
                while (count < position - 1) {
                    prev = prev.next;
                    count++;
                }
                temp.next = prev.next;
                prev.next = temp;

            }
            size_of_ll++;
        }
    }

    public static void delete_node(int position) {
        // @params position, integer
        if (position >= 1 && position <= size_of_ll) {
            // remove at head
            if (position == 1) {
                root = root.next;
            } else {
                int count = 1;
                node prev = root;
                // traverse till the previous node
                while (count < position - 1) {
                    prev = prev.next;
                    count++;
                }
                prev.next = prev.next.next;
            }
            size_of_ll--;
        }
    }

    public static void print_ll() {
        // Output each element followed by a space
        node temp = root;
        int flag = 0;
        // traverse the entire linked list
        while (temp != null) {
            if (flag == 0) {
                System.out.print(temp.data);
                flag = 1;
            } else
                System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }
}
