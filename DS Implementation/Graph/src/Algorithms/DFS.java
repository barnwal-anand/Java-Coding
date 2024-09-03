package Algorithms;

import Implementation.DLLNode;
import Implementation.Graph_WithDLL;

import java.util.*;

public class DFS {
    public static List<Integer> dfsTraversal(Graph_WithDLL graph, int source) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[graph.getNumOfVertices()];
        Stack<Integer> stack = new Stack<>();

        Arrays.fill(visited, false);
        stack.push(source);
        visited[source] = true;

        while(!stack.isEmpty()) {
            int temp = stack.pop();
            result.add(temp);

            DLLNode cur = graph.adjList[temp].getHead();
            while(cur != null) {
                if(!visited[cur.data]) {
                    stack.push(cur.data);
                    visited[cur.data] = true;
                }
                cur = cur.next;
            }
        }

        // Replace this placeholder return statement with your code
        return result;
    }
}
