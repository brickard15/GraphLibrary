package Graphs;

import java.util.Optional;

public class UndirectedWeightedGraph <NodeId, NodeData, EdgeData> implements Graph<NodeId, NodeData, EdgeData> {

    private Graph<NodeId, NodeData, EdgeData> graph;

    public UndirectedWeightedGraph(){
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
        return graph.getNodeCount();
    }

    @Override
    public void addEdge(NodeId nodeId1, NodeId nodeId2, EdgeData edgeData) {
        graph.addEdge(nodeId1, nodeId2, edgeData);
        graph.addEdge(nodeId2, nodeId1, edgeData);
    }

    @Override
    public boolean hasEdge(NodeId nodeId1, NodeId nodeId2) {
        return graph.hasEdge(nodeId1, nodeId2);
    }

    @Override
    public Optional<EdgeData> getEdgeData(NodeId node1Id, NodeId node2Id) {
        return graph.getEdgeData(node1Id, node2Id);
    }

    @Override
    public int getOutDegree(NodeId nodeId) {
        return graph.getOutDegree(nodeId);
    }
}
