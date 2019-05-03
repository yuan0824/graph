package DeliverGoods;

import java.util.Collections;
import java.util.LinkedList;

public class DeliverGoods {
    private LinkedList<Edge> edge;        //所有的边
    private LinkedList<Integer> vertex;   //路径
    public DeliverGoods(Graph graph){
        this.edge = graph.edge();
        vertex = new LinkedList<Integer>();
        vertex.add(1);
        search(graph , 1);
    }
    public void search(Graph graph , int v){
        while (!graph.adj(v).isEmpty()) {
            int w = Collections.min(graph.adj(v));
            graph.adj(v).remove(new Integer(w));
            graph.adj(w).remove(new Integer(v));
            edge.remove(new Edge(v, w));
            vertex.add(w);
            search(graph, w);
        }
        if(graph.adj(v).isEmpty() && !edge.isEmpty())  throw new RuntimeException("unsatisfactory route");
    }
    public LinkedList<Integer> getVertex(){
        return vertex;
    }
}
