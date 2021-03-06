package Multigraphs;

import java.util.List;
import java.util.Optional;

public interface Multigraph<NodeIdType, NodeType, EdgeType>{
    public void addNode(NodeIdType nodeId, final NodeType nodeData);
    public int getNodeCount();
    public boolean hasNode(final NodeIdType nodeId);
    public Optional<NodeType> getNodeData(final NodeIdType nodeId);
    public void addEdge(final NodeIdType nodeId1, final NodeIdType NodeId2, final EdgeType edgeData);
    public boolean hasEdge(final NodeIdType nodeIdType1, final NodeIdType nodeIdType2);
    public List<EdgeType> getEdgeData(NodeIdType node1Id, NodeIdType node2Id);
    public int getOutDegree(NodeIdType nodeId);
    //TODO: Consider do we need a getNumberOfEdges(NodeIdType nodeId) for a specific node?
}
