package com.bredeglabz.linkedlist;

public class LinkedList <T>{
    Node<T> head;
    Node<T> tail;
    public void add(T data) {
        Node<T> newMyNode = new Node(data);
        if (head == null) {
            head = newMyNode;
            tail = newMyNode;
        } else {
            tail.setNext(newMyNode);
            tail = newMyNode;
        }
    }public void push(T data) {
        Node<T> newMyNode = new Node(data);
        if (head == null) {
            head = newMyNode;
            tail = newMyNode;
        } else {
            newMyNode.setNext(head);
            head = newMyNode;
       }
    }
    public void insert(T element) {
        Node newNode = new Node(element);
        Node thisNode = head;
        while (thisNode.getData() != null){
            thisNode= thisNode.getNext();
            newNode.setNext(thisNode.getNext());
            thisNode.setNext(newNode);
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
