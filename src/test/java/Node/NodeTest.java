package Node;

import fj.P2;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class NodeTest {

    @Test
    public void addEdgeWithOneEdgeTest(){
        Node<Integer, Integer, Integer> node = new Node(1, 0);
        node.addEdge(2, 1);

        List<P2<Integer, Integer>> possibleEdges = node.getEdges();

        assertEquals(2, possibleEdges.get(0)._1(), 0.0);
    }
}
