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
    public void popMiddle(T element){
        Node<T> thisNode = head;
        if (element == head.getData()){
            thisNode = head.getNext();
            head = thisNode;
        }
        else {
            Node<T> previous = null;
            while (thisNode.getData() != element){
                previous = thisNode;
                thisNode = thisNode.getNext();
            }
            previous.setNext(thisNode.getNext());
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
