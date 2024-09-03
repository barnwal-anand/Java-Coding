import Implementation.Graph_WithDLL;

public class Main {
    public static void main(String[] args) {

        Graph_WithDLL g = new Graph_WithDLL(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);

        g.print();
    }
}