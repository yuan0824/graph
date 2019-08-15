import java.util.LinkedList;

/**
 * 无向图
 */
public class UndirectedGraph {
    private int v;    //顶点数目
    private int e;    //边的数目
    private LinkedList<Integer>[] adj;    //邻接表
    private LinkedList<Edge> edge;   //所有的边
    public UndirectedGraph(int v){
        this.v = v;
        this.e = 0;
        adj = new LinkedList[v];
        edge = new LinkedList<Edge>();
        for(int i = 0 ; i < v ; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v , int w){
        adj[v].add(w);
        adj[w].add(v);
        edge.add(new Edge(v,w));
        e++;
    }
    public LinkedList<Integer> adj(int v) {
        return adj[v];
    }

    public int getV() {
        return v;
    }

    public int getE() {
        return e;
    }

    public LinkedList<Edge> edge() {
        return edge;
    }
}
