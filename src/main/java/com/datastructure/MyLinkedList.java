package com.datastructure;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> newNode) {
        if(this.tail == null) {
           this.tail = newNode;
        }
        if(this.head == null) {
           this.head = newNode;
        } else {
           INode<K> tempNode = this.head;
           this.head = newNode;
           this.head.setNext(tempNode);
        }
    }

    public void append(INode<K> myNode) {
        if(this.head == null) {
            this.head = myNode;
        }
        if(this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public INode<K> search(K key) {
        INode<K> tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void printMyNodes() {
        System.out.println("My Nodes: " + head);
    }

    @Override
    public String toString() {
        return "MyLinkedList{" + head + '}';
    }


}
