package Graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UndirectedUnweightedGraphTest {

    private UndirectedUnweightedGraph<String, String> testGraph;
    private UndirectedUnweightedGraph<String, String> testGraphWith2Nodes;
    private static final String CITY_1_ID = "City1";
    private static final String CITY_2_ID = "City2";
    private static final String CITY_1_DATA= "Murray, KY";
    private static final String CITY_2_DATA = "Elkton, KY";


    @Before
    public void SetupNewGraph(){
        testGraph = new UndirectedUnweightedGraph();
        testGraphWith2Nodes = new UndirectedUnweightedGraph();
        testGraphWith2Nodes.addNode(CITY_1_ID, CITY_1_DATA);
        testGraphWith2Nodes.addNode(CITY_2_ID, CITY_2_DATA);
    }

    @Test
    public void hasNodeWithNoNodes(){
        Assert.assertFalse(testGraph.hasNode(CITY_1_ID));
        Assert.assertEquals(0, testGraph.getNodeCount());
        Assert.assertFalse(testGraph.getNodeData(CITY_1_ID).isPresent());
    }

    @Test
    public void AddSingleNode(){
        testGraph.addNode(CITY_1_ID, CITY_1_DATA);
        Assert.assertTrue(testGraph.hasNode(CITY_1_ID));
        Assert.assertEquals(1, testGraph.getNodeCount());
        Assert.assertTrue(testGraph.getNodeData(CITY_1_ID).isPresent());
        Assert.assertEquals(CITY_1_DATA, testGraphWith2Nodes.getNodeData(CITY_1_ID).get());
    }

    @Test
    public void AddTwoNodes(){
        Assert.assertTrue(testGraphWith2Nodes.hasNode(CITY_1_ID));
        Assert.assertTrue(testGraphWith2Nodes.hasNode(CITY_2_ID));
        Assert.assertEquals(2, testGraphWith2Nodes.getNodeCount());
        Assert.assertEquals(CITY_1_DATA, testGraphWith2Nodes.getNodeData(CITY_1_ID).get());
        Assert.assertEquals(CITY_2_DATA, testGraphWith2Nodes.getNodeData(CITY_2_ID).get());
    }

    @Test
    public void hasEdgeWithNoEdges(){
        Assert.assertFalse(testGraphWith2Nodes.hasEdge(CITY_1_ID, CITY_2_ID));
        Assert.assertFalse(testGraphWith2Nodes.hasEdge(CITY_2_ID, CITY_1_ID));
    }

    @Test
    public void addOneEdge(){
        testGraphWith2Nodes.addEdge(CITY_1_ID, CITY_2_ID);
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(CITY_1_ID, CITY_2_ID));
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(CITY_2_ID, CITY_1_ID));
    }

    @Test
    public void addEdgeWithJustOneNode(){
        testGraph.addNode(CITY_1_ID, CITY_1_DATA);
        testGraph.addEdge(CITY_1_ID, CITY_2_ID);
        Assert.assertFalse(testGraph.hasEdge(CITY_1_ID, CITY_2_ID));
        Assert.assertFalse(testGraph.hasEdge(CITY_2_ID, CITY_1_ID));
    }

    @Test
    public void addEdgeBetweenSameNodeTwice(){
        testGraphWith2Nodes.addEdge(CITY_1_ID, CITY_2_ID);
        testGraphWith2Nodes.addEdge(CITY_1_ID, CITY_2_ID);
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(CITY_1_ID, CITY_2_ID));
        Assert.assertTrue(testGraphWith2Nodes.hasEdge(CITY_2_ID, CITY_1_ID));
        Assert.assertEquals(1, testGraphWith2Nodes.getOutDegree(CITY_1_ID));
        Assert.assertEquals(1, testGraphWith2Nodes.getOutDegree(CITY_2_ID));
    }
}
