package Graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

public class DirectedUnweightedGraphTests {

    private DirectedUnweightedGraph<Integer, Point> testGraph;
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
    public void addTwoNodes(){
        testGraph.addNode(1, point1);
        testGraph.addNode(2, point2);
        Assert.assertTrue(testGraph.hasNode(1));
        Assert.assertTrue(testGraph.hasNode(2));
        Assert.assertTrue(testGraph.getNodeData(1).isPresent());
        Assert.assertTrue(testGraph.getNodeData(2).isPresent());
        Assert.assertEquals(point1, testGraph.getNodeData(1).get());
        Assert.assertEquals(point2, testGraph.getNodeData(2).get());
        Assert.assertEquals(2, testGraph.getNodeCount());
        Assert.assertEquals(0, testGraph.getOutDegree(1));
        Assert.assertEquals(0, testGraph.getOutDegree(2));
    }

    @Test
    public void addEdge(){
        testGraph.addNode(1, point1);
        testGraph.addNode(2, point2);
        testGraph.addEdge(1, 2);
        Assert.assertTrue(testGraph.hasEdge(1, 2));
        Assert.assertFalse(testGraph.hasEdge(2, 1));
        Assert.assertEquals(1, testGraph.getOutDegree(1));
        testGraph.addEdge(2, 1);
        Assert.assertTrue(testGraph.hasEdge(2, 1));
        testGraph.addNode(3, new Point(30, 30));
        testGraph.addEdge(1, 3);
        Assert.assertTrue(testGraph.hasEdge(1,3));
        Assert.assertEquals(2, testGraph.getOutDegree(1));
    }
}
