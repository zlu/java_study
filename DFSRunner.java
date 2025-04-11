import java.util.*;

class Graph<T> {
  private int V; // Number of vertices
  private List<List<T>> adj; // Adjacency lists

  // Constructor to create a graph with V vertices
  public Graph(int v) {
    V = v;
    adj = new ArrayList<>(v);
    for (int i = 0; i < v; ++i)
      adj.add(new ArrayList<>());
  }

  // Function to add an edge into the graph
  public void addEdge(T v, T w) {
    int vertexIndex = (Integer) v;
    if (vertexIndex >= V) {
      throw new IllegalArgumentException("Vertex index out of bounds");
    }
    adj.get(vertexIndex).add(w);
  }

  // Get adjacency list for a given vertex
  public List<T> getAdjacencyList(int vertexIndex) {
    return adj.get(vertexIndex);
  }

  // Get the number of vertices
  public int getV() {
    return V;
  }
}

class DFS<T> {
  private Graph<T> graph;

  // Constructor to create a DFS object with a given graph
  public DFS(Graph<T> graph) {
    this.graph = graph;
  }

  // The function to do DFS traversal. It uses recursive DFSUtil()
  public void DFS(T v) {
    boolean visited[] = new boolean[graph.getV()];
    int vertexIndex = (Integer) v;
    if (vertexIndex >= graph.getV()) {
      throw new IllegalArgumentException("Vertex index out of bounds");
    }
    DFSUtil(vertexIndex, visited);
  }

  // A recursive function to perform DFS
  private void DFSUtil(int v, boolean visited[]) {
    // Mark the current node as visited and print it
    visited[v] = true;
    System.out.print(v + " ");

    // Recur for all vertices adjacent to this vertex
    List<T> adjacencyList = graph.getAdjacencyList(v);
    for (T neighbor : adjacencyList) {
      int neighborIndex = (Integer) neighbor;
      if (!visited[neighborIndex])
        DFSUtil(neighborIndex, visited);
    }
  }
}

public class DFSRunner {
  public static void main(String args[]) {
    Graph<Integer> g = new Graph<>(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    DFS<Integer> dfs = new DFS<>(g);
    System.out.println("Following is Depth First Traversal (starting from vertex 2)");
    dfs.DFS(2);
  }
}
