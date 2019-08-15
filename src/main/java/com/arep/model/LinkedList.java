package com.arep.model;

public class LinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public Node getHead() {
        return head;
    }
    public Node getTail(){
        return tail;
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
            tail=node;
            size++;
        }
    }
    private void setHead(Node node) {
        head = node;
        tail = node;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }
    public Node getLast(){
        if(size==1){
            return head;
        }
        return get(size-1);
    }

    public Node get(int index)throws IndexOutOfBoundsException{
        if(index>=size || index<0){
            throw  new IndexOutOfBoundsException();
        }
        int iterator = 0;
        Node<T> current=head;
        while (iterator<index) {
            current = current.getRight();
            iterator++;
        }
        return current;
    }

    public void remove(int index) throws IndexOutOfBoundsException{
        if(index>=size || index<0){
            throw  new IndexOutOfBoundsException();
        }
        if(index==0 && size==1){
            head=null;
            tail=null;
        }
        int iterator = 0;
        Node<T> current=head;
        while (iterator<index) {
            current = current.getRight();
            iterator++;
        }
        if(current.hasNext() && current.hasPrior()){
            current.getLeft().setRight(current.getRight());
            current.getRight().setLeft(current.getLeft());
        }
        else if(current.hasNext() && !current.hasPrior()){
            current.getRight().setLeft(null);
            head=current.getRight();
        }
        else{
            current.getLeft().setRight(null);
        }
        size--;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                ", Nodes={");
        int iterator = 0;
        Node<T> current=head;
        string.append(current);
        while (iterator<size-1) {
            current = current.getRight();
            string.append(","+current);
            iterator++;
        }
        string.append("}}");
        return string.toString();
    }
}
