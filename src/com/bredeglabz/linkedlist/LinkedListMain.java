package com.bredeglabz.linkedlist;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("---------Welcome to the LinkedList program---------");
        LinkedList<Integer> list1 = new LinkedList();
        System.out.println("--------------Create Linked List----------------");
        list1.add(56);
        list1.add(30);
        list1.add(70);
        list1.print();
        System.out.println("------Searching for element 30 in the Linked List------");
        list1.search(30);
        list1.print();

    }
}
/*Ability to search
LinkedList to find Node
with value 30

- Write Junit Test Case as
demonstrated in class
- Loop through LinkedList to
find node with key 30*/