package com.bredeglabz.linkedlist;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("---------Welcome to the LinkedList program---------");
        LinkedList<Integer> list1 = new LinkedList();
        System.out.println("--------------Create Linked List----------------");
        list1.add(56);
        list1.add(30);
        list1.add(40);
        list1.add(70);
        list1.print();
        System.out.println("------Deleting 40 from the Linked List------");
        list1.popMiddle(40);
        list1.print();
    }
}
/*Ability to delete 40 from the Linked
List sequence of 56->30->40->70
and show the size of LinkedList is 3
- Write Junit Test Case as demonstrated in class
- Search LinkedList to find node with key value 40
- Delete the node
- Implement size() and show the Linked List size is 3
- Final Sequence: 56->30->70*/