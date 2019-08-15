import java.util.LinkedList;
/**
 * 测试无向图的广度优先遍历，求遍历路径，最短路径
 */
public class BFSTest {
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
        BreadthFirstSearch bfs = new BreadthFirstSearch(graph,0);
        LinkedList path = bfs.getEdgeTo();                //遍历路径
        LinkedList minPath = bfs.pathTo(8);            //到点8的最短路径
        System.out.println(path);
        System.out.println(minPath);
    }
}
