package DeliverGoods;

import java.util.LinkedList;

public class EdgeTest {
    public static void main(String[] args){
        Edge edge1 = new Edge(3,5);
        Edge edge2 = new Edge(3,6);
        LinkedList<Edge> list= new LinkedList<Edge>();
        list.add(edge1);
        list.add(edge2);
        System.out.println(list);
        list.remove(new Edge(3,5));
        System.out.println(list);
//        list.remove(new Edge(5,3));
//        System.out.println(list);
//        System.out.println(edge1 == edge2);

    }
}
