package EdgeWeightedGraph;

public class Edge implements Comparable<Edge>{
    private int v;             //顶点之一
    private int w;             //另一个顶点
    private int weight;        //边的权重
    public Edge(int v , int w , int weight){
        this.v = v;
        this.w = w;
        this. weight = weight;
    }
    public int either(){
        return v;
    }
    public int other(int vertex){
        if(vertex == v)  return w;
        else if(vertex == w)  return v;
        else throw new RuntimeException("Inconsistent edge");
    }
    public int getWeight(){
        return weight;
    }
    public String toString(){
        return String.format("%d-%d %d" , v , w , weight);
    }
    public int compareTo(Edge that){
        if(this.weight < that.weight) return -1;
        else if(this.weight > that.weight) return 1;
        else return 0;
    }
}
