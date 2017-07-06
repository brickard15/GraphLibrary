package Graphs;

public interface Graph <NodeType, NodeIdType, EdgeType>{

    public boolean hasNode(final NodeIdType nodeId);
    public boolean hasEdge(final NodeIdType nodeIdType1, final NodeIdType nodeIdType2);
    public void addNode(final NodeType nodeData, NodeIdType nodeId);
    public void addEdge(final NodeType node1, final NodeType node2);
}
