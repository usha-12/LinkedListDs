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
        System.out.println("--------Ability to create Linked List by appending 30 and 70 to 56---------");
        LinkedList<Integer> list2 = new LinkedList();
        list2.push(70);
        list2.push(30);
        list2.push(56);
        list2.print();
        System.out.println("-------Insert element----------");
        LinkedList list3 = new LinkedList();
        list3.add(56);
        list3.add(70);
        list3.print();
        list3.insert(30);
        list3.print();

    }
}
/*Ability to insert
30 between 56

and 70

- Final Sequence: 56->30->70*/