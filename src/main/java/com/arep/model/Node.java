package com.arep.model;


import org.javatuples.Pair;

public class Node {

    private Pair<Node,Node> neighbours;
    private Double data;

    public Node(Pair neighbours,Double data) {
        this.neighbours=neighbours;
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
    public Double getData() {
        return data;
    }

    public void setData(Double data) {
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
