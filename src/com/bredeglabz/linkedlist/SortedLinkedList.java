package com.bredeglabz.linkedlist;

public class SortedLinkedList <T extends Comparable>{
    Node<T> head;
    Node<T> tail;

    public static void main(String[] args) {
        SortedLinkedList<Integer> nodeMethods = new SortedLinkedList<Integer>();

        System.out.println("Sorting and Adding 56, 30, 40, 70");
        nodeMethods.sortAdd(56);
        nodeMethods.sortAdd(30);
        nodeMethods.sortAdd(40);
        nodeMethods.sortAdd(70);
        nodeMethods.printLinkedList();
    }

    public void sortAdd(T element) {
        Node<T> newNode = new Node<T>(element);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else
        if(((Node<T>) head).getData().compareTo(((Node<T>) newNode).getData()) > 0) {
            ((Node<T>) newNode).setNext(head);
            head = newNode;
        }
        else
        if (((Node<T>) tail).getData().compareTo(((Node<T>) newNode).getData()) < 0) {
            ((Node<T>) tail).setNext(newNode);
            tail = newNode;
        }
        else {
            Node<T> thisNode = ((Node<T>) head).getNext();
            Node<T> previous = head;
            while(((Node<T>) thisNode).getData().compareTo(((Node<T>) newNode).getData()) < 0 && thisNode != tail) {
                previous = thisNode;
                thisNode = ((Node<T>) thisNode).getNext();
            }
            ((Node<T>) previous).setNext(newNode);
            ((Node<T>) newNode).setNext(thisNode);
        }
    }

    public void printLinkedList() {
        Node<T> thisNode = head;

        if (thisNode == null)
            System.out.println("\nThe Linked list is empty.\n");
        else {
            System.out.println("\nDisplaying the Sorted Linked List : \n");
            while (thisNode != null) {
                System.out.print("  " + ((Node<T>) thisNode).getData());
                thisNode = ((Node<T>) thisNode).getNext();
            }
        }
    }
}
/*Ability to create Ordered Linked List
in ascending order of data entered
in following sequence 56, 30, 40,
and 70
- Refactor the code to create SortedLinkedList
Class
- Create Node that takes data that is
Comparable
- Perform Sorting during the add method call
- Final Sequence: 30->40->56->70*/