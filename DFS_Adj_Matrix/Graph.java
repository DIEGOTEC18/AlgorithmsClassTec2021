/* 
   Diego Velázquez Álvarez (A01027322)
   Análisis y diseño de algoritmos (Gpo 500)

   Tarea: Grafo de adyacencia DFS
*/

public class Graph{

    private boolean adjacencyMatrix[][];
    private int vertex;
    private int edges;

    private Graph(){}

    public Graph(int vertex, int edges){

        this.vertex = vertex;
        this.edges = edges;

        // Fill the matrix;
        // Bidirectional Graph so its symmetric

        adjacencyMatrix = new boolean[vertex][vertex];

    }

    public void addEdge(int start, int finish){

        // Bidirectional:
        adjacencyMatrix[start][finish] = true;
        adjacencyMatrix[finish][start] = true;

    }

    public void DFS(int start, boolean[] visitedList){

        // Print the current node:
        System.out.print(start + " ");

        // Set the current node as visited:
        visitedList[start] = true;

        // Traverse the whole adjacency matrix:
        for(int i = 0; i < this.vertex; i++){

            // Check if i is adjacent to the current node and if its not visited:
            if(this.adjacencyMatrix[start][i] == true && visitedList[i] == false){
                
                // Recurse to node i:
                this.DFS(i, visitedList);

            }

        }

    }

    // Time complexity O(vertex * edges) which is the size of the adjacency matrix.

    // Runner function:
    public static void main(String[] args) {

        int vertex = 5;
        int edges = 4;
        boolean visitedList[] = new boolean[vertex];

        Graph myGraph = new Graph(vertex, edges);

        myGraph.addEdge(0, 1);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(0, 3);
        myGraph.addEdge(0, 4);
        myGraph.addEdge(4, 3);

        myGraph.DFS(0, visitedList);
        System.out.println();

        visitedList = new boolean[vertex];
        myGraph.DFS(4, visitedList);

    }

}