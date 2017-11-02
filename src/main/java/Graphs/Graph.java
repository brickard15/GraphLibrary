package Graphs;

import java.util.Optional;

public interface Graph<NodeId, NodeData, EdgeData> {
    public void addNode(final NodeId nodeId, final NodeData nodeData);
    public boolean hasNode(final NodeId nodeId);
    public Optional<NodeData> getNodeData(final NodeId nodeId);
    public int getNodeCount();
}
