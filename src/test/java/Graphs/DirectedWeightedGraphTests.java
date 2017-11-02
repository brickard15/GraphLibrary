package Graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DirectedWeightedGraphTests {
    private Graph<Double, Double, Double> testGraph;

    @Before
    public void setupTestGraph(){
        testGraph = new DirectedWeightedGraph<>();
    }

    @Test
    public void addOneNode() {
        testGraph.addNode(1.0, 10.0);
        Assert.assertTrue(testGraph.hasNode(1.0));
        Assert.assertEquals(1, testGraph.getNodeCount());
    }

    @Test
    public void addTwoNodes(){
        testGraph.addNode(1.0, 10.0);
        testGraph.addNode(2.0, 20.0);
        Assert.assertEquals(2, testGraph.getNodeCount());
        Assert.assertTrue(testGraph.hasNode(1.0));
        Assert.assertTrue(testGraph.hasNode(2.0));
    }

    @Test
    public void addSameNodeTwice(){
        testGraph.addNode(1.0, 10.0);
        testGraph.addNode(1.0, 10.1);
        Assert.assertTrue(testGraph.hasNode(1.0));
        Assert.assertEquals(1, testGraph.getNodeCount());
        Assert.assertTrue(testGraph.getNodeData(1.0).isPresent());
        Assert.assertEquals(10.0, testGraph.getNodeData(1.0).get(), 0.0);
    }

    @Test
    public void doesNotHaveNodes(){
        Assert.assertEquals(0, testGraph.getNodeCount());
    }

    @Test
    public void addOneEdge(){
        testGraph.addNode(1.0, 10.0);
        testGraph.addNode(2.0, 20.0);
        testGraph.addEdge(1.0, 2.0, 100.0);
        Assert.assertTrue(testGraph.hasEdge(1.0, 2.0));
    }
}
