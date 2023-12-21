package org.example;

import org.example.Algorithms.Astar.AstarAlg;
import org.example.Algorithms.ISINAlg;
import org.example.Algorithms.ISRAELIAlg;

public class Main {
    public static void main(String[] args) {
        // "1" = blocked
        // "0" = additional movement cost
        String[][] maze = {
                {  "0",  "0",  "0",  "0",  "0",  "0",  "0",  "0"},
                {  "0",  "0",  "0",  "0",  "0",  "0",  "0",  "0"},
                {  "0",  "0",  "0","1","1","1",  "0",  "0"},
                {  "0",  "0",  "0",  "0",  "0","1",  "0",  "0"},
                {  "0",  "0","1",  "0",  "0","1",  "0",  "0"},
                {  "0",  "0","1",  "0",  "0","1",  "0",  "0"},
                {  "0",  "0","1","1","1","1",  "0",  "0"},
                {  "0",  "0",  "0",  "0",  "0",  "0",  "0",  "0"},
        };

        AstarAlg prueba = new AstarAlg(maze,0,0);
        prueba.findPath(7,7);
        /*ISRAELIAlg israeli = new ISRAELIAlg();
        israeli.menu();*/
    }
}