package com.arep.model;

import org.javatuples.Pair;

public class LinkedList {

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
            head.setAt0(node);
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
        return get(size-1);
    }

    public Node get(int index)throws IndexOutOfBoundsException{
        if(index+1>size){
            throw  new IndexOutOfBoundsException();
        }
        int iterator = 0;
        Node current=head.getValue0();
        while (iterator<=index) {
            current = current.getNeighbours().getValue1();
            iterator++;
        }
        return current;
    }
}
