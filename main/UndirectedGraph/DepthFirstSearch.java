package UndirectedGraph;

import java.util.LinkedList;

public class DepthFirstSearch {
    private boolean[] marked;     //该点是否被访问
    private LinkedList<Integer> edgeTo;
    public DepthFirstSearch(UndirectedGraph graph , int s){
        marked = new boolean[graph.getV()];
        edgeTo = new LinkedList<Integer>();
        edgeTo.add(s);
        dfs(graph , s);
    }
    private void dfs(UndirectedGraph graph , int v){
        marked[v] = true;
        for(int w : graph.adj(v)){
            if(!marked[w]) {
                edgeTo.add(w);
                dfs(graph,w);
            }
        }
    }

    public LinkedList<Integer> getEdgeTo(){
        return edgeTo;
    }

}
