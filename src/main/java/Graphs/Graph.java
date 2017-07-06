package Graphs;

public interface Graph <NodeType, NodeIdType, EdgeType>{

    public boolean hasNode(final NodeIdType nodeId);
    public boolean hasEdge(final NodeType node1, final NodeType node2);
    public void addNode(final NodeType node);
    public void addEdge(final NodeType node1, final NodeType node2);
}
