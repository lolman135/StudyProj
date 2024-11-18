package ua.lesson20;

public class GraphMatrix {

    int vertex;
    int[][] matrix;

    //main
    public static void main(String[] args) {

        GraphMatrix graph = new GraphMatrix(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.printGraph();
    }

    public GraphMatrix(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int start, int destination){
        matrix[start][destination] = 1;
        matrix[destination][start] = 1;
    }

    public void printGraph(){
        System.out.println("Adjacency matrix:\n");

        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
