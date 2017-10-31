package Graphs;

import java.util.Optional;

public interface Graph <NodeIdType, NodeType, EdgeType>{

    public boolean hasNode(final NodeIdType nodeId);
    public Optional<NodeType> getNodeData(final NodeIdType nodeId);
    public int getNodeCount();
    public boolean hasEdge(final NodeIdType nodeIdType1, final NodeIdType nodeIdType2);
    public void addNode(NodeIdType nodeId, final NodeType nodeData);
    public void addEdge(final NodeIdType nodeId1, final NodeIdType NodeId2, final EdgeType edgeData);
}
