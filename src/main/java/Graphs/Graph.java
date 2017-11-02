package Graphs;

import java.util.Optional;

public interface Graph<NodeId, NodeData, EdgeData> {
    public void addNode(final NodeId nodeId, final NodeData nodeData);
    public boolean hasNode(final NodeId nodeId);
    public Optional<NodeData> getNodeData(final NodeId nodeId);
    public int getNodeCount();
    public void addEdge(final NodeId nodeId1, final NodeId nodeId2, final EdgeData edgeData);
    public boolean hasEdge(final NodeId nodeId1, final NodeId nodeId2);
}
