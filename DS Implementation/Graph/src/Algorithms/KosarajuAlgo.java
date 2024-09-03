package Algorithms;

// Kosaraju’s strongly connected component algorithm
// Application: This algo is based on DFS to find strongly connected nodes or mother vertex

import Implementation.DLLNode;
import Implementation.Graph_WithDLL;

import java.util.Arrays;

public class KosarajuAlgo {

    public int findMotherVertex(Graph_WithDLL g) {
        boolean[] visited = new boolean[g.getNumOfVertices()];
        Arrays.fill(visited, false);
        int lastV = 0;

        for (int node = 0; node < g.getNumOfVertices(); node++) {
            if(!visited[node]) {
                dfs(g, node, visited);
                lastV = node;
            }
        }

        // Check lastVisited is mother vertex
        Arrays.fill(visited, false);
        dfs(g, lastV, visited);
        for(boolean temp : visited) {
            if(temp != true) {
                return -1;
            }
        }

        return lastV;
    }

    private void dfs(Graph_WithDLL g, int src, boolean[] visited) {
        visited[src] = true;

        DLLNode cur = g.adjList[src].getHead();

        while (cur != null) {
            if (!visited[cur.data]) {
                dfs(g, cur.data, visited);
            }
            cur = cur.next;
        }
    }
}
