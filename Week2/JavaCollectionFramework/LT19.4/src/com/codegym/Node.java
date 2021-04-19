package com.codegym;

public class Node {
    private int element;
    private Node left;
    private Node right;

    public Node(int element) {
        this.element = element;

    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(int value) {
        this.left = new Node(value);
    }

    public Node getRight() {
        return right;
    }

    public void setRight(int value) {
        this.right = new Node(value);
    }

    public boolean search(int findValue, Node root) {
        Node temper = root;
        while (temper != null) {
            if (findValue < temper.element) {
                temper = temper.left;
            } else if (findValue > temper.element) {
                temper = temper.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
