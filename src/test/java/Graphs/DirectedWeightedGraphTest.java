package Graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DirectedWeightedGraphTest {
    private Graph<Integer, Integer, Integer> testGraph;

    @Before
    public void setup(){
        testGraph = new DirectedWeightedGraph<>();
    }

    @Test
    public void addOneNodeTest(){
        Assert.assertEquals(0, testGraph.getNodeCount());
        testGraph.addNode(1, 100);
        Assert.assertTrue(testGraph.hasNode(1));
        Assert.assertEquals(1, testGraph.getNodeCount());
        Assert.assertTrue(testGraph.getNodeData(1).isPresent());
        Assert.assertEquals(100, testGraph.getNodeData(1).get(),0.0);
    }

    @Test
    public void addSameNodeIdTwice(){
        Assert.assertEquals(0, testGraph.getNodeCount());
        testGraph.addNode(1, 100);
        Assert.assertEquals(1, testGraph.getNodeCount());
        Assert.assertEquals(100, testGraph.getNodeData(1).get(), 0.0);
        testGraph.addNode(1, 101);
        Assert.assertEquals(1, testGraph.getNodeCount());
        Assert.assertEquals(100, testGraph.getNodeData(1).get(), 0.0);
    }

    @Test
    public void addEdgeTest(){
        testGraph.addNode(1, 100);
        testGraph.addNode(2, 100);
        testGraph.addEdge(1, 2, 1000);
        Assert.assertEquals(2, testGraph.getNodeCount());
        Assert.assertTrue(testGraph.hasEdge(1, 2));
    }

    //TODO: Implement these tests
    @Test
    public void hasNodePositiveTest(){

    }

    @Test
    public void hasNodeNegativeTest(){

    }
}
