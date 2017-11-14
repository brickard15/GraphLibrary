package Graphs;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class DirectedUnweightedGraphTests {

    @Test
    public void addOneNode(){
        Graph<Integer, Point, Double> testGraph = new DirectedUnweightedGraph();
        Point point1 =  new Point(10,10);
        testGraph.addNode(1, point1);
        Assert.assertTrue(testGraph.hasNode(1));
        Assert.assertTrue(testGraph.getNodeData(1).isPresent());
        Assert.assertEquals(point1, testGraph.getNodeData(1).get());
    }
}
