/**
 * 无权值的边
 */
public class Edge {
    private int v;               //小
    private int w;               //大
    public Edge(int v , int w){
        if(v < w){
            this.v = v;
            this.w = w;
        }
        else if(v > w) {
            this.w = v;
            this.v = w;
        }
        else throw new RuntimeException("Inconsistent edge");
    }
    public String toString(){
        return String.format("%d-%d" , v , w);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.toString().equals(this.toString())){
            return true;
        }
        else return false;
    }
}
