package Graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class DirectedUnweightedGraphTests {

    private Graph<Integer, Point, Double> testGraph;
    private Point point1;
    private Point point2;

    @Before
    public void SetupTestGraph(){
        testGraph = new DirectedUnweightedGraph<>();
        point1 =  new Point(10,10);
        point2 = new Point(20, 20);
    }

    @Test
    public void addOneNode(){
        testGraph.addNode(1, point1);
        Assert.assertTrue(testGraph.hasNode(1));
        Assert.assertTrue(testGraph.getNodeData(1).isPresent());
        Assert.assertEquals(point1, testGraph.getNodeData(1).get());
        Assert.assertEquals(1, testGraph.getNodeCount());
    }

    @Test
    public void addTwoNodeTest(){
        testGraph.addNode(1, point1);
        testGraph.addNode(2, point2);
        Assert.assertTrue(testGraph.hasNode(1));
        Assert.assertTrue(testGraph.hasNode(2));
        Assert.assertTrue(testGraph.getNodeData(1).isPresent());
        Assert.assertTrue(testGraph.getNodeData(2).isPresent());
        Assert.assertEquals(point1, testGraph.getNodeData(1).get());
        Assert.assertEquals(point2, testGraph.getNodeData(2).get());
        Assert.assertEquals(2, testGraph.getNodeCount());
    }

}
