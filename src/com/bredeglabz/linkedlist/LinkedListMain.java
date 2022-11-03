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
        System.out.println("------Inserting 40 after 30 in the Linked List------");
        list1.search(40,30);
        list1.print();

    }
}
/*Ability to insert 40 after 30 to
the Linked List sequence of
56->30->70
- Write Junit Test Case as demonstrated
in class
- Search LinkedList to get Node with key
value 30
- Then Insert 40 to 30
- Final Sequence: 56->30->40->70*/