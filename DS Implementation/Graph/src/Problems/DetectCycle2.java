package Problems;

import java.util.ArrayList;

//Detect cycle in un-directed graph
public class DetectCycle2 {
    public boolean detectCycle(int n, ArrayList<ArrayList<Integer>> edges)
    {
        // create graph from edge list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(n);
        for(int it = 0; it < n; it++) {
            graph.add(new ArrayList<>());
        }
        for(ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v= edge.get(1);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        return dfsUtil(graph, visited, 0, -1);
    }

    private boolean dfsUtil(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int s, int p) {
        visited[s] = true;

        for(int nbr : graph.get(s)) {
            if(!visited[nbr]) {
                if(dfsUtil(graph, visited, nbr, s)) {
                    return true;
                }
            }
            else if(nbr != p) {
                return true;
            }
        }

        return false;
    }
}
