package Graphs;

public class DirectedWeightedGraph <NodeType, EdgeType> implements Graph <NodeType, EdgeType> {
    @Override
    public boolean hasNode(final NodeType node) {
        return false;
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
