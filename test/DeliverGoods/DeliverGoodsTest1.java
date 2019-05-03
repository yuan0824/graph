package DeliverGoods;

public class DeliverGoodsTest1 {
    public static void main(String[] args){
        Graph graph = new Graph(4);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        graph.addEdge(1,3);
        graph.addEdge(3,4);
        graph.addEdge(1,4);
        DeliverGoods deliverGoods = new DeliverGoods(graph);
        System.out.println(deliverGoods.getVertex());
    }
}
