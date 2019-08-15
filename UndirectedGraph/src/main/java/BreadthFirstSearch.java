import java.util.LinkedList;

/**
 * 广度优先搜索，借助队列实现遍历顺序，此外可以求最短路径
 */
public class BreadthFirstSearch {
    private boolean[] marked;    //到达该点的最短路径是否已知
    private int[] edgeTo;        //到达该点的已知路径上的最后一个顶点
    private int s;               //起点
    private LinkedList<Integer> list;
    public BreadthFirstSearch(UndirectedGraph graph , int s){
        this.s = s;
        list = new LinkedList<Integer>();
        marked = new boolean[graph.getV()];
        edgeTo =new int[graph.getV()];
        bfs(graph,s);
    }

    /**
     *
     * @param graph 无向图
     * @param s 起点
     */
    private void bfs(UndirectedGraph graph , int s){
        LinkedList<Integer> temp = new LinkedList<Integer>();
        marked[s] = true;
        temp.add(s);
        list.add(s);
        while (!temp.isEmpty()){
            int v = temp.remove();
            for(int w : graph.adj(v)){
                if(!marked[w]){
                    edgeTo[w] = v;
                    marked[w] = true;
                    temp.add(w);
                    list.add(w);
                }
            }
        }
    }

    public LinkedList<Integer> getEdgeTo(){
        return list;
    }

    /**
     * 到终点的最短路径
     * @param v 终点
     * @return
     */
    public LinkedList<Integer> pathTo(int v){
        if(!marked[v]) return null;
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int x = v;x != s ; x = edgeTo[x]){
            list.addFirst(x);
        }
        list.addFirst(s);
        return list;
    }
}
