package ua.lesson20;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphList {

    int vertex;
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        GraphList graph = new GraphList(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);

        graph.printGraph();
    }

    public GraphList(int vertex) {
        this.vertex = vertex;
        list = new ArrayList<>();
        for (int i = 0; i < vertex; i++) {
            list.add(new ArrayList<>());
        }
    }

    public void addEdge(int start, int destination){
        list.get(start).add(destination);
        list.get(destination).add(start);
    }

    public void printGraph(){
        for (int i = 0; i < vertex; i++) {
            System.out.print("Vertex " + i + ":");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(" -> " + list.get(i).get(j));
            }
            System.out.println();
        }
    }
}
