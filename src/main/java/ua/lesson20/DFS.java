package ua.lesson20;

import java.util.LinkedList;

public class DFS {

    int vertex;
    LinkedList<Integer>[] list;

    public static void main(String[] args) {
        int startVertex = 0;
        int numItems = 5;

        DFS graph =  new DFS(numItems);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);

        graph.addEdge(2, 3);
        graph.addEdge(2, 4);

        graph.addEdge(3, 4);

        graph.doDfs(startVertex);
    }

    public DFS(int vertex) {
        this.vertex = vertex;
        list =  new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int start, int destination){
        list[start].add(destination);
        list[destination].add(start);
    }

    private void dfsUtil(int v, boolean[] visited){
        visited[v] = true;
        System.out.println(v + " ");

        for (Integer value : list[v]) {
            if(!visited[value]){
                dfsUtil(value, visited);
            }
        }
    }

    public void doDfs(int v){
        boolean[] visited = new boolean[vertex];
        dfsUtil(v, visited);
    }


}
