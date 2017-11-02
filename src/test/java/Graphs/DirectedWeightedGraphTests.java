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
    public void AddOneNode() {
        testGraph.addNode(1.0, 10.0);
        Assert.assertTrue(testGraph.hasNode(1.0));
    }

    @Test
    public void AddSameNodeTwice(){
        testGraph.addNode(1.0, 10.0);
        testGraph.addNode(1.0, 10.1);
        Assert.assertTrue(testGraph.hasNode(1.0));
        Assert.assertTrue(testGraph.getNodeData(1.0).isPresent());
        Assert.assertEquals(10.0, testGraph.getNodeData(1.0).get(), 0.0);
    }
}
