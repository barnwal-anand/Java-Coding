package Implementation;

import java.util.*;

public class GraphWithArrayList {
    int vertices;
    List<List<Integer>> adjacency;

    GraphWithArrayList(int vertices) {
        this.vertices = vertices;
        this.adjacency = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            this.adjacency.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        if (u >= 0 && u < vertices && v >= 0 && v < vertices) {
            adjacency.get(u).add(v);
            adjacency.get(v).add(u);
        }
    }

    void printAdjacencyList() {
        for (int i = 0; i < vertices; ++i) {
            System.out.print("Vertex " + i + " :");
            for (int j = 0; j < adjacency.get(i).size(); ++j) {
                System.out.print(" -> " + adjacency.get(i).get(j));
            }
            System.out.println();
        }
    }
}
