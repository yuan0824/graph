import java.util.Collections;
import java.util.LinkedList;

/**
 * Prim算法，求最小生成树
 */
public class PrimMST {
    private boolean[] marked;              //最小生成树的顶点
    private LinkedList<WeightEdge> mst;          //最小生成树的边
    private LinkedList<WeightEdge> pq;           //横切边
    private int value;                     //最小生成树的权重
    public PrimMST(EdgeWeightedGraph graph){
        pq = new LinkedList<WeightEdge>();
        mst = new LinkedList<WeightEdge>();
        marked = new boolean[graph.getV()];
        visit(graph , 0);               //从点0开始遍历
        while(!pq.isEmpty()){
            WeightEdge e = Collections.min(pq);
            pq.remove(e);
            int v = e.either();
            int w = e.other(v);
            if(marked[v] && marked[w]) continue;
            mst.add(e);
            if(!marked[v]) visit(graph , v);
            if(!marked[w]) visit(graph , w);
        }
    }

    /**
     * 访问点v，将其未遍历的边添加至队列
     * @param graph 加权图
     * @param v 顶点
     */
    public void visit(EdgeWeightedGraph graph , int v){
        marked[v] = true;
        for(WeightEdge e : graph.adj(v)){
            if(!marked[e.other(v)]){
                pq.add(e);
            }
        }
    }
    public LinkedList<WeightEdge> getEdge(){
        return mst;
    }
    public int getValue(){
        value = 0;
        for(WeightEdge edge : mst){
            value += edge.getWeight();
        }
        return value;
    }
}
