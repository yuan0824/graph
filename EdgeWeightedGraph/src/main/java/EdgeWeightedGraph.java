import java.util.LinkedList;

/**
 * 加权图
 */
public class EdgeWeightedGraph {
    private int v;                     //顶点数目
    private int e;                     //边的数目
    private LinkedList<WeightEdge>[] adj;    //邻接表

    public EdgeWeightedGraph(int v){
        this.v = v;
        this.e = 0;
        adj = new LinkedList[v];
        for(int i = 0 ; i < v ; i++){
            adj[i] = new LinkedList<WeightEdge>();
        }
    }
    public void addEdge(WeightEdge edge){
        int v = edge.either();
        int w = edge.other(v);
        adj[v].add(edge);
        adj[w].add(edge);
        e++;
    }

    public int getV() {
        return v;
    }
    public LinkedList<WeightEdge> adj(int v) {
        return adj[v];
    }


}
