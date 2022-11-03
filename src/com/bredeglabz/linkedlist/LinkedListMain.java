package com.bredeglabz.linkedlist;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("---------Welcome to the LinkedList program---------");
        LinkedList<Integer> list1 = new LinkedList();
        System.out.println("--------------Create Linked List----------------");
        list1.add(70);
        list1.add(30);
        list1.add(56);
        list1.print();
        System.out.println("--------Add data in Linked List---------");
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.push(70);
        list2.push(30);
        list2.push(56);
        list2.print();
    }
}
