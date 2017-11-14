package Graphs;

import java.util.Optional;

public class UndirectedUnweightedGraph<NodeId, NodeData>{
    private Graph<NodeId, NodeData, Integer> graph;
    private static final int defaultEdgeData = 1;

    public UndirectedUnweightedGraph(){
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
        if (graph.hasNode(nodeId1) && graph.hasNode(nodeId2)){
            graph.addEdge(nodeId1, nodeId2, defaultEdgeData);
            graph.addEdge(nodeId2, nodeId1, defaultEdgeData);
        }
    }

    public boolean hasEdge(NodeId nodeId1, NodeId nodeId2) {
        return graph.hasEdge(nodeId1, nodeId2) && graph.hasEdge(nodeId2, nodeId1);
    }

    public int getOutDegree(NodeId nodeId) {
        return graph.getOutDegree(nodeId);
    }
}
