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
        System.out.println("\n------After Deleting the Last element------");
        list1.popLast(70);
        list1.print();

    }
}
/*Ability to delete the last
element in the LinkedList
of sequence 56->30->70 - Write popLast method
- Note there is new tail
- Final Sequence: 56->30*/