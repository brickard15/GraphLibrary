package Graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DirectedWeightedGraphTest {
    private Graph<Integer, Integer, Integer> emptyTestGraph;
    private Graph<Integer, Integer, Integer> testGraphWith2Nodes;

    @Before
    public void setupGraphWithNoNodes(){
        emptyTestGraph = new DirectedWeightedGraph<>();
    }

    @Before
    public void setupTestGraphWith2Nodes(){
        testGraphWith2Nodes = new DirectedWeightedGraph<>();
        testGraphWith2Nodes.addNode(1, 100);
        testGraphWith2Nodes.addNode(2, 200);
    }

    @Test
    public void addOneNodeTest(){
        Assert.assertEquals(0, emptyTestGraph.getNodeCount());
        emptyTestGraph.addNode(1, 100);
        Assert.assertTrue(emptyTestGraph.hasNode(1));
        Assert.assertEquals(1, emptyTestGraph.getNodeCount());
        Assert.assertTrue(emptyTestGraph.getNodeData(1).isPresent());
        Assert.assertEquals(100, emptyTestGraph.getNodeData(1).get(),0.0);
    }

    @Test
    public void addSameNodeIdTwice(){
        Assert.assertEquals(0, emptyTestGraph.getNodeCount());
        emptyTestGraph.addNode(1, 100);
        Assert.assertEquals(1, emptyTestGraph.getNodeCount());
        Assert.assertEquals(100, emptyTestGraph.getNodeData(1).get(), 0.0);
        emptyTestGraph.addNode(1, 101);
        Assert.assertEquals(1, emptyTestGraph.getNodeCount());
        Assert.assertEquals(100, emptyTestGraph.getNodeData(1).get(), 0.0);
    }

    @Test
    public void addEdgeTest(){
        testGraphWith2Nodes.addEdge(1, 2, 1000);
        Assert.assertEquals(2, testGraphWith2Nodes.getNodeCount());
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(1, 2));
    }

    @Test
    public void getEdgeValueTest(){
        testGraphWith2Nodes.addEdge(1, 2, 1000);
        Assert.assertEquals(1000, testGraphWith2Nodes.getEdgeData(1, 2).get(), 0.0);
    }

    //TODO: Implement these tests
    @Test
    public void hasNodePositiveTest(){

    }

    @Test
    public void hasNodeNegativeTest(){

    }
}
