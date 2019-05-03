package EdgeWeightedGraph;

import java.util.Collections;
import java.util.LinkedList;

public class PrimMST {
    private boolean[] marked;              //最小生成树的顶点
    private LinkedList<Edge> mst;          //最小生成树的边
    private LinkedList<Edge> pq;           //横切边
    private int value;                     //最小生成树的权重
    public PrimMST(EdgeWeightedGraph graph){
        pq = new LinkedList<Edge>();
        mst = new LinkedList<Edge>();
        marked = new boolean[graph.getV()];
        visit(graph , 0);
        while(!pq.isEmpty()){
            Edge e = Collections.min(pq);
            pq.remove(e);
            int v = e.either();
            int w = e.other(v);
            if(marked[v] && marked[w]) continue;
            mst.add(e);
            if(!marked[v]) visit(graph , v);
            if(!marked[w]) visit(graph , w);
        }
    }
    public void visit(EdgeWeightedGraph graph , int v){
        marked[v] = true;
        for(Edge e : graph.adj(v)){
            if(!marked[e.other(v)]){
                pq.add(e);
            }
        }
    }
    public LinkedList<Edge> getEdge(){
        return mst;
    }
    public int getValue(){
        value = 0;
        for(Edge edge : mst){
            value += edge.getWeight();
        }
        return value;
    }
}
