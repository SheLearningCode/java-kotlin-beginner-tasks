package org.example.Algorithms.Astar;
import java.util.*;

public class AstarAlg {
    public static String[][] maze;
    public Node start;
    public Node goal;

    public HashSet<Node> openNeighboors = new HashSet<>();
    public List<Node> closedNeighboors = new ArrayList<>();
    public Vector<Node> route = new Vector<>();

    public AstarAlg(String[][] maze, int x, int y){
        this.maze = maze;
        this.start = new Node(x,y);
    }

    public void findPath(int x, int y){
        this.goal = new Node(x,y);

        this.start.setNode(this.goal);

        openNeighboors.add(this.start);

        findCheaper();

        Node result = null;
        double totalEnergy = 0.0;

        result = closedNeighboors.get(closedNeighboors.size() - 1);
        route.add(result.getParent());
        maze[result.getX()][result.getY()] = "*";

        while (result.getParent() != null){
            route.add(result.getParent());
            result = result.getParent();
        }

        for (Node node: route){
            maze[node.getX()][node.getY()] = "*";
            totalEnergy += node.getG();
        }
        showMaze();
        System.out.println("The total amount of energy used is --> " + totalEnergy);
    }

    public void findCheaper(){
        Node cheaper = findOptimalOpen(); //piensa en usar el comparable en la clase Node

        openNeighboors.remove(cheaper);
        closedNeighboors.add(cheaper);

        if(!cheaper.equals(this.goal)){

            Vector<Node> neighboors = new Vector<>();
            neighboors = getNeighboors(cheaper);

            for (Node node: neighboors){
                if(!containsOpen(node) && !containsClosed(node)){
                    node.setNode(this.goal);
                    node.setParent(cheaper);
                    openNeighboors.add(node);
                }

            }

            findCheaper();
        }
    }

    public Vector<Node> getNeighboors(Node n){
        Vector<Node> neighbours = new Vector<>();

        if (n.getX() + 1 < maze.length) {
            neighbours.add(new Node(n.getX() + 1, n.getY()));

            if (n.getY() + 1 < maze[n.getX()].length)
                neighbours.add(new Node(n.getX() + 1, n.getY() + 1));
            else
                neighbours.add(new Node(n.getX() + 1, n.getY() - 1));

        }else if (n.getX() - 1 >= 0) {
            neighbours.add(new Node(n.getX() - 1, n.getY()));

            if (n.getY() - 1 >= 0)
                neighbours.add(new Node(n.getX() - 1, n.getY() - 1));
            else if (n.getY() + 1 < maze[n.getX()].length)
                neighbours.add(new Node(n.getX() - 1, n.getY() + 1));

        }

        if (n.getY() + 1 < maze[n.getX()].length) {
            neighbours.add(new Node(n.getX(), n.getY() + 1));
        }

        if (n.getY() - 1 >= 0) {
            neighbours.add(new Node(n.getX(), n.getY() - 1));
        }
        return neighbours;
    }

    public boolean containsOpen(Node n){
        for (Node node: openNeighboors) {
            if(node.getX() == n.getX() && node.getY() == n.getY()){
                return true;
            }
        }
        return false;
    }

    public boolean containsClosed(Node n){
        for (Node node: closedNeighboors) {
            if(node.getX() == n.getX() && node.getY() == n.getY()){
                return true;
            }
        }
        return false;
    }
    public Node findOptimalOpen(){
        double nodeFValue = Double.POSITIVE_INFINITY;
        Node optimalNode = null;
        for(Node node: openNeighboors){ //english please
            if(node.getF() < nodeFValue){
                nodeFValue = node.getF();
                optimalNode = node;
            }
        }

        return optimalNode;
    }

    public void showMaze(){
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
