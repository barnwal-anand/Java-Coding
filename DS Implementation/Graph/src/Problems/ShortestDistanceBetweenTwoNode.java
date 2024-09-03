package Problems;

import Implementation.DLLNode;
import Implementation.Graph_WithDLL;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceBetweenTwoNode {
    public int findMin(Graph_WithDLL g, int src, int dest) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[g.getNumOfVertices()];
        int[] distance = new int[g.getNumOfVertices()];

        q.add(src);
        visited[src] = true;
        distance[src] = 0;

        while(!q.isEmpty()) {
            int nbr = q.peek();
            q.remove();
            if(nbr == dest) {
                return distance[nbr];
            }

            DLLNode cur = g.adjList[nbr].getHead();
            while(cur != null) {
                int temp = (int)cur.data;
                if(!visited[temp]) {
                    visited[temp] = true;
                    q.add(temp);
                    distance[temp] = distance[nbr] + 1;
                }
                cur = cur.next;
            }
        }

        return -1;
    }
}
