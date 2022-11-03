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
    public void search(T element, T previous) {
        Node<T> newNode = new Node<>(element);
        Node<T> currNode = head;
        while (currNode.getData() != previous) {
           currNode= currNode.getNext();
           newNode.setNext(currNode.getNext());
           currNode.setNext(newNode);
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
