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

    @Test
    public void addSameEdgeDifferentDirection(){
        graphWith3Nodes.addEdge(1, 3, 100);
        graphWith3Nodes.addEdge(3, 1, 300);
        Assert.assertTrue(graphWith3Nodes.hasEdge(1, 3));
        Assert.assertTrue(graphWith3Nodes.hasEdge(3, 1));
        Assert.assertTrue(graphWith3Nodes.getEdgeData(1, 3).isPresent());
        Assert.assertEquals(100, graphWith3Nodes.getEdgeData(1, 3).get(),0.0);
        Assert.assertTrue(graphWith3Nodes.getEdgeData(3, 1).isPresent());
        Assert.assertEquals(100, graphWith3Nodes.getEdgeData(3, 1).get(),0.0);
    }

    @Test
    public void addOneEdgeOutDegreeForBothNodes(){
        graphWith3Nodes.addEdge(1, 3, 100);
        Assert.assertEquals(0, graphWith3Nodes.getOutDegree(2));
        Assert.assertEquals(1, graphWith3Nodes.getOutDegree(1));
        Assert.assertEquals(1, graphWith3Nodes.getOutDegree(3));
    }

    @Test
    public void add2EdgesBetween3Nodes(){
        graphWith3Nodes.addEdge(1, 2, 100);
        graphWith3Nodes.addEdge(1, 3, 200);
        Assert.assertEquals(2, graphWith3Nodes.getOutDegree(1));
        Assert.assertEquals(1, graphWith3Nodes.getOutDegree(2));
        Assert.assertEquals(1, graphWith3Nodes.getOutDegree(3));
    }
}
