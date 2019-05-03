package UndirectedGraphTest;

import UndirectedGraph.BreadthFirstSearchMinPath;
import UndirectedGraph.UndirectedGraph;

import java.util.LinkedList;

public class BFSMinpathTest {
    public static void main(String[] args){
        UndirectedGraph graph = new UndirectedGraph(10);
        graph.addEdge(0 , 1);
        graph.addEdge(0 , 2);
        graph.addEdge(1 , 3);
        graph.addEdge(2 , 3);
        graph.addEdge(2 , 4);
        graph.addEdge(2 , 7);
        graph.addEdge(3 , 5);
        graph.addEdge(3 , 6);
        graph.addEdge(4 , 6);
        graph.addEdge(4 , 7);
        graph.addEdge(5 , 8);
        graph.addEdge(6 , 8);
        graph.addEdge(7 , 9);
        graph.addEdge(8 , 9);
        BreadthFirstSearchMinPath bfs = new BreadthFirstSearchMinPath(graph,0);
        LinkedList path = bfs.pathTo(8);
        System.out.println(path);

    }
}
