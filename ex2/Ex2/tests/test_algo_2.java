import api.*;
import org.json.JSONException;

import java.io.IOException;

public class test_algo_2 {
    public static void main(String[] args) throws JSONException, IOException {
        dw_graph_algorithms al = new DWGraph_Algo();
        DWGraph_DS gr = new DWGraph_DS();

        al.init(gr);
//        System.out.println(al.toString());
        al.save("save3.txt");
        dw_graph_algorithms al2 = new DWGraph_Algo();
        al2.load("save3.txt");

        testConnected(al,al2);
        testShortestDist(al,al2);
        testShortestPath(al,al2);
    }

    public static void testConnected(dw_graph_algorithms al, dw_graph_algorithms al2) {

        boolean b1 = al.isConnected(), b2 = al2.isConnected();
        if(!b1 || !b2){
            System.err.println("al.isConnected(): "+b1+", al.isConnected(): "+b2);
        }
    }
    public static void testShortestDist(dw_graph_algorithms al, dw_graph_algorithms al2) {

//        assertEquals(0.0+"", al.shortestPathDist(0,6)+"");
//        assertEquals(0.0+"", al2.shortestPathDist(0,6)+"");
        double b1 = al.shortestPathDist(0,6), b2 = al2.shortestPathDist(0,6);
        if(b1 != 0) {
            System.err.println("al hasn't the shortest path");
        }
        if(b2 != 0) {
            System.err.println("al2 hasn't the shortest path");
        }
    }
    public static void testShortestPath(dw_graph_algorithms al, dw_graph_algorithms al2) {

//        assertEquals(0+"", al.shortestPath(0,6).size()+"");
//        assertEquals(0+"", al2.shortestPath(0,6).size()+"");
        int b1 = al.shortestPath(0,6).size(), b2 = al2.shortestPath(0,6).size();
        if(b1 != 0) {
            System.err.println("al hasn't the shortest path");
        }
        if(b2 != 0) {
            System.err.println("al2 hasn't the shortest path");
        }
    }
}
