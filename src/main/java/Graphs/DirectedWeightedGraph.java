package Graphs;

import java.util.ArrayList;
import java.util.List;

public class DirectedWeightedGraph <NodeType, EdgeType> implements Graph <NodeType, EdgeType> {
    private final List<NodeType> nodes;

    public DirectedWeightedGraph(){
        nodes = new ArrayList<>();
    }

    @Override
    public boolean hasNode(final NodeType node) {
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
        nodes.add(node);
    }

    @Override
    public void addEdge(final NodeType node1, final NodeType node2) {

    }
}
