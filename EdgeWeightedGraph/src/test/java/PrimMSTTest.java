/**
 * 测试最小生成树的各个边，所有边的权值和
 */
public class PrimMSTTest {
    public static void main(String[] args){
        EdgeWeightedGraph graph = new EdgeWeightedGraph(6);
        graph.addEdge(new WeightEdge(0,1,17));
        graph.addEdge(new WeightEdge(0,4,16));
        graph.addEdge(new WeightEdge(0,5,1));
        graph.addEdge(new WeightEdge(1,2,6));
        graph.addEdge(new WeightEdge(1,3,5));
        graph.addEdge(new WeightEdge(1,5,11));
        graph.addEdge(new WeightEdge(2,3,10));
        graph.addEdge(new WeightEdge(3,4,4));
        graph.addEdge(new WeightEdge(3,5,14));
        graph.addEdge(new WeightEdge(4,5,33));
        PrimMST primMST = new PrimMST(graph);
        for(WeightEdge edge : primMST.getEdge()){
        System.out.println(edge);
        }
        System.out.println(primMST.getValue());
    }
}
