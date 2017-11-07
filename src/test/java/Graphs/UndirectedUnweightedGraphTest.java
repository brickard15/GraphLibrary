package Graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UndirectedUnweightedGraphTest {

    private Graph<String, String, String> testGraph;
    private Graph<String, String, String> testGraphWith2Nodes;
    private static final String CITY_1_ID = "City1";
    private static final String CITY_2_ID = "City2";


    @Before
    public void SetupNewGraph(){
        testGraph = new UndirectedUnweightedGraph();
        testGraphWith2Nodes = new UndirectedUnweightedGraph();
        testGraphWith2Nodes.addNode(CITY_1_ID, "Murray, KY");
        testGraphWith2Nodes.addNode(CITY_2_ID, "Elkton, KY");
    }

    @Test
    public void hasNodeWithNoNodes(){
        Assert.assertFalse(testGraph.hasNode("City1"));
    }

    @Test
    public void AddSingleNode(){
        testGraph.addNode(CITY_1_ID, "Murray, KY");
        Assert.assertTrue(testGraph.hasNode("City1"));
    }

    @Test
    public void AddTwoNodes(){
        Assert.assertTrue(testGraphWith2Nodes.hasNode(CITY_1_ID));
        Assert.assertTrue(testGraphWith2Nodes.hasNode(CITY_2_ID));
    }

    @Test
    public void hasEdgeWithNoEdges(){
        Assert.assertFalse(testGraphWith2Nodes.hasEdge(CITY_1_ID, CITY_2_ID));
        Assert.assertFalse(testGraphWith2Nodes.hasEdge(CITY_2_ID, CITY_1_ID));
    }

    @Test
    public void addOneEdge(){
        testGraphWith2Nodes.addEdge(CITY_1_ID, CITY_2_ID, "Interstate 40");
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(CITY_1_ID, CITY_2_ID));
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(CITY_2_ID, CITY_1_ID));
    }

    @Test
    public void addEdgeWithJustOneNode(){
        testGraph.addNode(CITY_1_ID, "Murray, KY");
        testGraph.addEdge(CITY_1_ID, CITY_2_ID, "I40");
        Assert.assertFalse(testGraph.hasEdge(CITY_1_ID, CITY_2_ID));
        Assert.assertFalse(testGraph.hasEdge(CITY_2_ID, CITY_1_ID));
    }

    @Test
    public void addEdgeBetweenSameNodeTwice(){
        testGraphWith2Nodes.addEdge(CITY_1_ID, CITY_2_ID, "I40");
        testGraphWith2Nodes.addEdge(CITY_1_ID, CITY_2_ID, "I24");
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(CITY_1_ID, CITY_2_ID));
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(CITY_2_ID, CITY_1_ID));
        Assert.assertEquals("I40", testGraphWith2Nodes.getEdgeData(CITY_1_ID, CITY_2_ID).get());
        Assert.assertEquals("I40", testGraphWith2Nodes.getEdgeData(CITY_2_ID, CITY_1_ID).get());
        Assert.assertEquals(1, testGraphWith2Nodes.getOutDegree(CITY_1_ID));
        Assert.assertEquals(1, testGraphWith2Nodes.getOutDegree(CITY_2_ID));
    }

    @Test
    public void addEdgeBetweenSameNodeInDifferentDirections(){
        testGraphWith2Nodes.addEdge(CITY_2_ID, CITY_1_ID, "I24");
        testGraphWith2Nodes.addEdge(CITY_1_ID, CITY_2_ID, "I40");
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(CITY_1_ID, CITY_2_ID));
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(CITY_2_ID, CITY_1_ID));
        Assert.assertEquals("I24", testGraphWith2Nodes.getEdgeData(CITY_1_ID, CITY_2_ID).get());
        Assert.assertEquals("I24", testGraphWith2Nodes.getEdgeData(CITY_2_ID, CITY_1_ID).get());
        Assert.assertEquals(1, testGraphWith2Nodes.getOutDegree(CITY_1_ID));
        Assert.assertEquals(1, testGraphWith2Nodes.getOutDegree(CITY_2_ID));

    }
}
