public class UndirectedTest {
    public static void main(String args[]){
        UndirectedGraph graph = new UndirectedGraph(7);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(0,3);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(4,5);
        graph.addEdge(4,6);
        graph.addEdge(5,6);
        graph.addEdge(2,4);
        for(int i : graph.adj(5)){
            System.out.println(i);
        }

    }
}
