package Problems;

import java.util.ArrayList;
import java.util.List;

public class PathExist {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];

        return dfs(graph, source, destination, visited);
    }

    private boolean dfs(List<List<Integer>> graph, int s, int d, boolean[] v) {
        v[s] = true;
        if(s == d) {
            return true;
        }

        for(int it = 0; it < graph.get(s).size(); it++) {
            int nbr = graph.get(s).get(it);
            if(!v[nbr]) {
                if(dfs(graph, nbr, d, v)) {
                    return true;
                }
            }
        }

        return false;
    }
}
