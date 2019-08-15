import java.util.LinkedList;

/**
 * 深度优先算法，递归实现遍历顺序
 */
public class DepthFirstSearch {
    private boolean[] marked;     //该点是否被访问
    private LinkedList<Integer> edgeTo;
    public DepthFirstSearch(UndirectedGraph graph , int s){
        marked = new boolean[graph.getV()];
        edgeTo = new LinkedList<Integer>();
        edgeTo.add(s);
        dfs(graph , s);
    }

    /**
     *
     * @param graph 无向图
     * @param v 起点
     */
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
