package com.codegym;

public class MyLinkedList<T> {
    private Node tail;
    private Node head;
    private int numNodes = 0;

    private class Node {
        private T data;
        private Node next;

        public Node() {

        }

        public Node(T t) {
            this.data = t;
        }

        public T getData() {
            return this.data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public MyLinkedList() {

    }

    public MyLinkedList(T t) {
        this.head = new Node(t);
        this.numNodes++;
    }

    public void add(int index, T t) {
        if (index > this.numNodes) {
            throw new IndexOutOfBoundsException("Vi tri khong hop le");
        }
        if (index == 0) {
            addFirst(t);
        } else if (index == this.numNodes) {
            addLast(t);
        } else {
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node middle = current.next;
            current.next = new Node(t);
            (current.next).next = middle;
            this.numNodes++;
        }

    }

    public void addLast(T t) {
        Node newNode = new Node(t);
        if (this.tail == null) {
            head = tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = this.tail.next;
        }
        this.numNodes++;
    }

    public void addFirst(T t) {
        Node current = new Node(t);
        current.next = this.head;
        head = current;
        if (tail == null) {
            tail = head;
        }
        this.numNodes++;
    }

    public T remove(int index) {
        if (index < 0 || index > this.numNodes - 1) {
            throw new IndexOutOfBoundsException("Vi tri khong hop le");
        }
        if (this.numNodes == 0) {
            return null;
        } else if (this.numNodes == 1) {
            this.numNodes--;
            Node middle = head;
            head = tail = null;
            return middle.data;
        } else {
            Node current = head;
            if (index == 0) {
                head = current.next;
                this.numNodes--;
                return current.data;
            } else {
                for (int i = 1; i < index; i++) {
                    current = current.next;
                }
                Node holder = current.next;
                if (index == this.numNodes - 1) {
                    this.tail = current;
                    current.next = null;
                } else {
                    current.next = holder.next;
                }
                this.numNodes--;
                return holder.data;
            }
        }
    }

    public boolean remove(T t) {
        int index = 0;
        boolean isFound = false;
        Node current = this.head;
        if (current.data.equals(t)) {
            this.remove(index);
            isFound = true;
        }
        while (current != null) {
            index++;
            if (current.data.equals(t)) {
                this.remove(index);
                isFound = true;
            }
            current = current.next;
        }
        return isFound;
    }

    public int size() {
        return this.numNodes;
    }

    //??
    public T clone() {
        return this.head.data;
    }

    public void display() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.getData() + ", ");
            System.out.println(current.next);
            current = current.next;
        }
        System.out.println("Size: " + this.numNodes);
    }

    public boolean contains(T t) {
        boolean isFound = false;
        Node current = this.head;
        if (current.data.equals(t)) {
            isFound = true;
        }
        while (current != null) {
            if (current.data.equals(t)) {
                isFound = true;
            }
            current = current.next;
        }
        return isFound;
    }

    public int indexOf(T t) {
        int index = -1;
        Node current = this.head;
        if (current.data.equals(t)) {
            index = 0;
        }
        for (int i = 1; i < this.numNodes; i++) {
            current = current.next;
            if (current.data.equals(t)) {
                index = i;
            }
        }
        return index;
    }

    public boolean add(T t) {
        this.add(this.numNodes, t);
        return true;
    }

    public T get(int i) {
        if (i < 0 || i > this.numNodes - 1) {
            return null;
        }
        if (i == 0) {
            return this.head.getData();
        }
        Node current = this.head;
        for (int j = 1; j <= i; j++) {
            current = current.next;
        }
        return current.getData();
    }

    public void clear() {
        this.head = null;
        this.tail = null;
    }
    public T getFirst(){
        if(this.head!=null){
            return this.head.getData();
        }else{
            return null;
        }
    }
    public T getLast(){
        if(this.tail!=null){
            return this.tail.getData();
        }else{
            return null;
        }
    }

}
