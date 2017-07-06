package Graphs;

import Node.Node;
import NodeIdGenerators.NodeIdGenerator;

import java.util.ArrayList;
import java.util.List;

public class DirectedWeightedGraph <NodeType, NodeIdType, EdgeType> implements Graph <NodeType, EdgeType> {
    private final List<Node<NodeType, NodeIdType, EdgeType>> nodes;

    public DirectedWeightedGraph(){
        nodes = new ArrayList<>();
    }

    @Override
    public boolean hasNode(final Node node) {
        final boolean[] isPresent = {false};

        nodes.forEach((possibleNode) -> {
            if (node.equals(possibleNode)){
                isPresent[0] = true;
            }
        });

        return isPresent[0];
    }

    @Override
    public boolean hasEdge(final NodeType node1, final NodeType node2) {
        return false;
    }

    @Override
    public void addNode(final NodeType node) {

    }

    @Override
    public void addEdge(final NodeType node1, final NodeType node2) {

    }
}
