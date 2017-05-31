package Node;

import fj.P2;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NodeTest {

    public Node<Integer, Integer, Integer> setupNodeWithOneEdge(){
        Node<Integer, Integer, Integer> node = new Node(1, 0);
        node.addEdge(2, 1);
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
}
