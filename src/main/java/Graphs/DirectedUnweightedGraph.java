package Graphs;

import java.util.Optional;

public class DirectedUnweightedGraph<NodeId, NodeData, EdgeData> implements Graph<NodeId, NodeData, EdgeData> {

    private final Graph<NodeId, NodeData, EdgeData> graph;

    public DirectedUnweightedGraph(){
        graph = new DirectedWeightedGraph<>();
    }


    @Override
    public void addNode(NodeId nodeId, NodeData nodeData) {
        graph.addNode(nodeId, nodeData);
    }

    @Override
    public boolean hasNode(NodeId nodeId) {
        return graph.hasNode(nodeId);
    }

    @Override
    public Optional<NodeData> getNodeData(NodeId nodeId) {
        return graph.getNodeData(nodeId);
    }

    @Override
    public int getNodeCount() {
        return 0;
    }

    @Override
    public void addEdge(NodeId nodeId1, NodeId nodeId2, EdgeData edgeData) {

    }

    @Override
    public boolean hasEdge(NodeId nodeId1, NodeId nodeId2) {
        return false;
    }

    @Override
    public Optional<EdgeData> getEdgeData(NodeId node1Id, NodeId node2Id) {
        return null;
    }

    @Override
    public int getOutDegree(NodeId nodeId) {
        return 0;
    }
}
