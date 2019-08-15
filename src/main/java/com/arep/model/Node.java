package com.arep.model;

public class Node<E> {

    private Node left;
    private Node right;
    private E data;

    public Node(E data) {
        this.data = data;
    }



    public void setRight(Node node){
        right=node;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        data = data;
    }
    public boolean hasNext(){
        return right!=null;
    }
    public boolean hasPrior(){
        return left!=null;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
