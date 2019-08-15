/**
 * 测试不存在解决方案
 */
public class DeliverGoodsTest2 {
    public static void main(String[] args){
        UndirectedGraph graph = new UndirectedGraph(5);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(2,3);
        DeliverGoods deliverGoods = new DeliverGoods(graph);
        System.out.println(deliverGoods.getVertex());
    }
}
