package Algorithms;

import Implementation.DLLNode;
import Implementation.Graph_WithDLL;
import java.util.*;

public class BFS {

    public static List<Integer> bfsTraversal(Graph_WithDLL graph, int source) {
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[graph.getNumOfVertices()];
        Queue queue = new LinkedList();

        Arrays.fill(visited, false);
        queue.add(source);
        visited[source] = true;

        while(!queue.isEmpty()) {
            int temp = (int)queue.peek();
            list.add(temp);
            queue.remove();

            DLLNode cur = graph.adjList[temp].getHead();
            while(cur != null) {
                if(!visited[cur.data]) {
                    queue.add(cur.data);
                    visited[cur.data] = true;
                }
                cur = cur.next;
            }
        }

        return list;
    }
}