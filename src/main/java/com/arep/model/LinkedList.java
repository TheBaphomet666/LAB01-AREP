package com.arep.model;

import org.javatuples.Pair;


public class LinkedList<T> {

    private Pair<Node,Node> head;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public Node getHead() {
        return head.getValue0();
    }
    public Node getTail(){
        return head.getValue1();
    }

    public void add(Node node){
        if(isEmpty()){
            setHead(node);
            size=1;
        }
        else {
            Node lastNode=getLast();
            lastNode.setRight(node);
            node.setLeft(lastNode);
            head.setAt1(node);
            size++;
        }
    }
    private void setHead(Node node) {
        this.head = new Pair<Node, Node>(node,node);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }
    public Node getLast(){
        if(size==1){
            return head.getValue0();
        }
        return get(size-1);
    }

    public Node get(int index)throws IndexOutOfBoundsException{
        if(index>=size){
            throw  new IndexOutOfBoundsException();
        }
        int iterator = 0;
        Node<T> current=head.getValue0();
        while (iterator<=index) {
            current = current.getRight();
            iterator++;
        }
        return current;
    }
}
