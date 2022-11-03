package com.bredeglabz.linkedlist;

public class LinkedList <T>{
    Node<T> head;
    Node<T> tail;
    public void add(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    public void search(T element) {
        Node<T> currNode = head;
        while (currNode != null) {
            if (currNode.getData().equals(element)) {
                System.out.println("\nFound element " + element + " in the Linked List!");
                currNode = (Node<T>) currNode.getNext();
            }
        }
    }

    public void print(){
        if (head == null){
            System.out.println("Linked List is Empty");
        }else {
            Node<T> currNode = head;
            while (currNode != null){
                System.out.print(currNode.getData()+" ");
                currNode = currNode.getNext();
            }
            System.out.println();
        }
    }
}
