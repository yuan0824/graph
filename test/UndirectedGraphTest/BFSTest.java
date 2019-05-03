package UndirectedGraphTest;

import UndirectedGraph.BreadthFirstSearch;
import UndirectedGraph.UndirectedGraph;

import java.util.LinkedList;
public class BFSTest {
    public static void main(String args[]){
        UndirectedGraph graph = new UndirectedGraph(13);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,5);
        graph.addEdge(3,7);
        graph.addEdge(4,6);
        graph.addEdge(5,9);
        graph.addEdge(5,10);
        graph.addEdge(7,8);
        graph.addEdge(9,11);
        graph.addEdge(10,12);
        BreadthFirstSearch bfs = new BreadthFirstSearch(graph,0);
        LinkedList path = bfs.getEdgeTo();
        System.out.println(path);

    }
}
