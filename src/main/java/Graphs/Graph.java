package Graphs;

public interface Graph <NodeType, NodeIdType, EdgeType>{

    public boolean hasNode(final NodeIdType nodeId);
    public boolean hasEdge(final NodeIdType nodeIdType1, final NodeIdType nodeIdType2);
    public void addNode(final NodeType nodeData, NodeIdType nodeId);
    public void addEdge(final NodeIdType nodeId1, final NodeIdType NodeId2, final EdgeType edgeData);
}
