package Node;

import fj.P2;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
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

    //TODO: Create hasEdgeWithOneEdgeNegativeResult test method.
}
