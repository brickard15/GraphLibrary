package Graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UndirectedWeightedGraphTests {

    private UndirectedWeightedGraph<Integer, Integer, Integer> graph;
    private UndirectedWeightedGraph<Integer, Integer, Integer> graphWith3Nodes;

    @Before
    public void SetupGraph(){
        graph = new UndirectedWeightedGraph<>();
    }

    @Before
    public void SetupGraphWith3Nodes(){
        graphWith3Nodes = new UndirectedWeightedGraph<>();
        graphWith3Nodes.addNode(1, 10);
        graphWith3Nodes.addNode(2, 20);
        graphWith3Nodes.addNode(3, 30);
    }

    @Test
    public void addOneEdge(){
        graphWith3Nodes.addEdge(1, 2, 100);
        Assert.assertTrue(graphWith3Nodes.hasEdge(1, 2));
        Assert.assertTrue(graphWith3Nodes.hasEdge(2, 1));
    }


}
