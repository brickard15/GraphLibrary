package Multigraphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class DirectedWeightedMultigraphTest {
    private Multigraph<Integer, Integer, Integer> emptyTestGraph;
    private Multigraph<Integer, Integer, Integer> testGraphWith2Nodes;

    @Before
    public void setupGraphWithNoNodes(){
        emptyTestGraph = new DirectedWeightedMultigraph<>();
    }

    @Before
    public void setupTestGraphWith2Nodes(){
        testGraphWith2Nodes = new DirectedWeightedMultigraph<>();
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
        Assert.assertEquals(1000, testGraphWith2Nodes.getEdgeData(1, 2).get(0), 0.0);
    }

    @Test
    public void has2Nodes(){
        Assert.assertTrue(testGraphWith2Nodes.hasNode(1));
        Assert.assertTrue(testGraphWith2Nodes.hasNode(2));
        Assert.assertFalse(testGraphWith2Nodes.hasNode(3));
    }

    @Test
    public void hasNoNodes(){
        Assert.assertFalse(emptyTestGraph.hasNode(1));
        Assert.assertFalse(emptyTestGraph.hasNode(2));
    }

    @Test
    public void edgesAreDirectional(){
        testGraphWith2Nodes.addEdge(1, 2, 1000);
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(1,2));
        Assert.assertFalse(testGraphWith2Nodes.hasEdge(2, 1));
    }

    @Test
    public void addMultipleEdgesBetweenTheSamePoints(){
        testGraphWith2Nodes.addEdge(1, 2, 1000);
        testGraphWith2Nodes.addEdge(2,1, 2000);
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(1, 2));
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(2, 1));
    }

    @Test
    public void addMultipleEdgesGoingTheSameDirectionBetweenTheSameNodes(){
        testGraphWith2Nodes.addEdge(1, 2, 1000);
        testGraphWith2Nodes.addEdge(1, 2, 1001);
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(1, 2));
        List<Integer> edgeDataPoints = testGraphWith2Nodes.getEdgeData(1,2);
        Assert.assertEquals(2, edgeDataPoints.size());
        Assert.assertEquals(1000, edgeDataPoints.get(0), 0.0);
        Assert.assertEquals(1001, edgeDataPoints.get(1), 0.0);
    }
}
