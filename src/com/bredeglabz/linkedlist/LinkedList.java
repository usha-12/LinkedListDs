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
    public T popLast(T element) {
        Node<T> newNode = new Node(element);
        if (head == null)
            return null;
        else {
            Node<T> temp = head;
            while (temp.getNext() != tail) {
                temp = (Node<T>) temp.getNext();
            }
            T data = tail.getData();
            temp.setNext(null);
            tail = temp;
            return data;
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
