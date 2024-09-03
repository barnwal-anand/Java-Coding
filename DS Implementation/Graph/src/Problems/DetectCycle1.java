package Problems;

import Implementation.DLLNode;
import Implementation.Graph_WithDLL;

import java.util.Arrays;

//Detect cycle in directed graph
public class DetectCycle1 {

    public boolean detectCycle(Graph_WithDLL g) {
        boolean[] visited = new boolean[g.getNumOfVertices()];
        boolean[] recNodeStack = new boolean[g.getNumOfVertices()];
        Arrays.fill(visited, false);

        for (int node = 0; node < g.getNumOfVertices(); node++) {
            if (detectCycleRec(g, node, visited, recNodeStack)) {
                return true;
            }
        }
        return false;
    }

    private boolean detectCycleRec(Graph_WithDLL g, int node, boolean[] visited, boolean[] recNodeStack) {
        if (recNodeStack[node]) {
            return true;
        }
        if (visited[node]) {
            return false;
        }
        visited[node] = true;
        recNodeStack[node] = true;
        DLLNode headNode = g.adjList[node].getHead();
        while (headNode != null) {
            int adjacent = headNode.data;
            if (detectCycleRec(g, adjacent, visited, recNodeStack)) {
                return true;
            }
            headNode = headNode.next;
        }
        recNodeStack[node] = false;
        return false;
    }
}
