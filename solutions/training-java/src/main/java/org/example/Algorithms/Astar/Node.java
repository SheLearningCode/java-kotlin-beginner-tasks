package org.example.Algorithms.Astar;

public class Node {
    private int x;
    private int y;

    private double g;

    private double h;

    private double f;

    private Node parent;

    ////////////////////////////////////////////////////////////////////
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getG() {
        return g;
    }

    public double getF() {
        return f;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node n){
        parent = n;
    }

    ////////////////////////////////////////////////////////////////////

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setNode(Node n){
        if(AstarAlg.maze[this.x][this.y] == "0"){
            this.g = 1;
        }else{
            this.g = 100;
        }

        this.h = euclideanDistance(n);

        this.f = this.g + this.h;
    }

    public double euclideanDistance(Node n){
        return Math.sqrt(Math.pow((n.x-this.x),2) + Math.pow((n.y-this.y), 2));
    }

    @Override
    public String toString(){
        return "["+this.x+"-"+this.y+"] --> G="+this.g +"/ H="+this.h +"/ F="+this.f +"/";
    }


    @Override
    public boolean equals(Object obj) {
        return this.x == ((Node) obj).x && this.y == ((Node) obj).y;
    }
}
