package com.arep.model;

public class Node<T> {

    private Node left;
    private Node right;
    private T data;

    public Node(T data) {
        this.data = data;
    }



    public void setRight(Node node){
        right=node;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
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
