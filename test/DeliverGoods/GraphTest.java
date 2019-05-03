package DeliverGoods;

public class GraphTest {
    public static void main(String[] args){
        Graph graph = new Graph(4);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        graph.addEdge(1,3);
        graph.addEdge(3,4);
        graph.addEdge(1,4);
        System.out.println(graph.adj(1));
        System.out.println(graph.adj(2));
        System.out.println(graph.adj(3));
        System.out.println(graph.adj(4));
        System.out.println(graph.edge());
    }


}
