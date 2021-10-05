package com.bridgelabz;

public class MyNode<K> {
    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    private MyNode  next;
    private K key;

    public MyNode(K key) {
        this.key=null;
        this.next=null;
    }
}
