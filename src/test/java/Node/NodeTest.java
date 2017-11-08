package Node;

import fj.P2;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NodeTest {

    public Node<Integer, Integer, Integer> setupNodeWithOneEdge(){
        Node<Integer, Integer, Integer> node = new Node(0, 1);
        node.addEdge(2, 3);
        return node;
    }

    @Test
    public void addEdgeWithOneEdgeTest(){
        Node<Integer, Integer, Integer> node = setupNodeWithOneEdge();
        List<P2<Integer, Integer>> possibleEdges = node.getEdges();
        assertEquals(2, possibleEdges.get(0)._1(), 0.0);
    }

    @Test
    public void hasEdgeWithOneEdgePositiveResult(){
        Node<Integer, Integer, Integer> node = setupNodeWithOneEdge();
        assertTrue(node.hasEdge(2));
    }

    @Test
    public void hasEdgeWithOneEdgeNegativeResult(){
        Node<Integer, Integer, Integer> node = setupNodeWithOneEdge();
        assertFalse(node.hasEdge(3));
    }

    @Test
    public void getNodeIDTest() {
        Node<Integer, Integer, Integer> node = setupNodeWithOneEdge();
        assertEquals(0, node.getNodeID(), 0.0);
    }

    @Test
    public void getEdgesWithOneEdgeOneResult(){
        Node<Integer, Integer, Integer> node = setupNodeWithOneEdge();
        List<P2<Integer, Integer>> edges = node.getEdges(2);
        assertEquals(1, edges.size());
        assertEquals(2, edges.get(0)._1(), 0.0);
    }

    @Test
    public void  getNodeDataPositiveTest(){
        Node<Integer, Integer, Integer> node = setupNodeWithOneEdge();
        Integer nodeData = node.getNodeData();
        assertEquals(1, nodeData, 0.0);
    }

    @Test
    public void getEdgeDataTest(){
        Node<Integer, Integer, Integer> node = setupNodeWithOneEdge();
        List<Integer> edgeData = node.getEdgeData( 2);
        Assert.assertEquals(3, edgeData.get(0) , 0.0);
    }

    @Test
    public void multipleEdgesWithSameNode(){
        Node<Integer, Integer, Integer> node = new Node<Integer, Integer, Integer>(1, 10);
        node.addEdge(2, 200);
        node.addEdge(2, 202);
        List<P2<Integer, Integer>> edges = node.getEdges();
        Assert.assertEquals(2, edges.size());
        Assert.assertEquals(200, edges.get(0)._2(), 0.0);
        Assert.assertEquals(202, edges.get(1)._2(), 0.0);
    }

    @Test
    public  void getDegreeWithEdges(){
        Node<Integer, Integer, Integer> node = new Node(1, 10);
        Assert.assertEquals(0, node.getDegree());
    }

    @Test
    public void getDegreeOfOne(){
        Node<Integer, Integer, Integer> node = new Node(1, 10);
        node.addEdge(2, 100);
        Assert.assertEquals(1, node.getDegree());
    }
}
