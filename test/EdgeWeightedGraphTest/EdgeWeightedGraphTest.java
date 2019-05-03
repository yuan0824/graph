package EdgeWeightedGraphTest;

import EdgeWeightedGraph.EdgeWeightedGraph;
import EdgeWeightedGraph.Edge;

public class EdgeWeightedGraphTest {
    public static void main(String[] args){
        EdgeWeightedGraph graph = new EdgeWeightedGraph(6);
        graph.addEdge(new Edge(0,1,17));
        graph.addEdge(new Edge(0,4,16));
        graph.addEdge(new Edge(0,5,1));
        graph.addEdge(new Edge(1,2,6));
        graph.addEdge(new Edge(1,3,5));
        graph.addEdge(new Edge(1,5,11));
        graph.addEdge(new Edge(2,3,10));
        graph.addEdge(new Edge(3,4,4));
        graph.addEdge(new Edge(3,5,14));
        graph.addEdge(new Edge(4,5,33));
        for(Edge e : graph.adj(3)){
            System.out.println(e);
        }


    }
}
