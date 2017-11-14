package Graphs;

import java.util.Optional;

public class DirectedUnweightedGraph<NodeId, NodeData>{

    private final Graph<NodeId, NodeData, Integer> graph;
    private static final int defaultEdgeData = 1;

    public DirectedUnweightedGraph(){
        graph = new DirectedWeightedGraph<>();
    }

    public void addNode(NodeId nodeId, NodeData nodeData) {
        graph.addNode(nodeId, nodeData);
    }

    public boolean hasNode(NodeId nodeId) {
        return graph.hasNode(nodeId);
    }

    public Optional<NodeData> getNodeData(NodeId nodeId) {
        return graph.getNodeData(nodeId);
    }

    public int getNodeCount() {
        return graph.getNodeCount();
    }

    public void addEdge(NodeId nodeId1, NodeId nodeId2) {
        graph.addEdge(nodeId1, nodeId2, defaultEdgeData);
    }

    public boolean hasEdge(NodeId nodeId1, NodeId nodeId2) {
        return graph.hasEdge(nodeId1, nodeId2);
    }

    public int getOutDegree(NodeId nodeId) {
        return graph.getOutDegree(nodeId);
    }
}
