package com.arep.model;


import org.javatuples.Pair;

public class Node<T> {

    private Pair<Node,Node> neighbours;
    private T data;

    public Node(Double data) {
        neighbours = new Pair<Node, Node>(null,null);
        data = data;
    }

    public Pair<Node, Node> getNeighbours() {
        return neighbours;
    }

    public void setRight(Node node){
        neighbours.setAt1(node);
    }

    public void setleft(Node node){
        neighbours.setAt0(node);
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        data = data;
    }
    public boolean hasNext(){
        return neighbours.getValue1()!=null;
    }
    public boolean hasPrior(){
        return neighbours.getValue0()!=null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "neighbours=" + neighbours +
                ", data=" + data +
                '}';
    }
}
