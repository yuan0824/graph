package UndirectedGraph;

import java.util.LinkedList;

public class BreadthFirstSearch {
    private boolean[] marked;    //该点是否被访问
    private LinkedList<Integer> edgeTo;
    public BreadthFirstSearch(UndirectedGraph graph , int s){
        edgeTo = new LinkedList<Integer>();
        marked = new boolean[graph.getV()];
        bfs(graph,s);
    }
    private void bfs(UndirectedGraph graph , int s){
        LinkedList<Integer> temp = new LinkedList<Integer>();
        marked[s] = true;
        temp.add(s);
        edgeTo.add(s);
        while (!temp.isEmpty()){
            int v = temp.remove();
            for(int w : graph.adj(v)){
                if(!marked[w]){
                    marked[w] = true;
                    temp.add(w);
                    edgeTo.add(w);
                }
            }
        }
    }

    public LinkedList<Integer> getEdgeTo(){
        return edgeTo;
    }
}
