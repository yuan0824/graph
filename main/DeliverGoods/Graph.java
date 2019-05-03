package DeliverGoods;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
    private int v;    //顶点数目
    private int e;    //边的数目
    private LinkedList<Integer>[] adj;    //邻接表
    private LinkedList<Edge> edge;   //所有的边
    public Graph(int v){
        this.v = v;
        this.e = 0;
        adj = new LinkedList[v];
        edge = new LinkedList<Edge>();
        for(int i = 0 ; i < v ; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v , int w){
        adj[v-1].add(w);
        adj[w-1].add(v);
        e++;
        edge.add(new Edge(v,w));
    }
    public LinkedList<Integer> adj(int v) {
        return adj[v-1];
    }

    public LinkedList<Edge> edge() {
        return edge;
    }

    public int getV() {
        return v;
    }

    public int getE() {
        return e;
    }
}
