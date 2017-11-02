package Graphs;

import Multigraphs.DirectedWeightedMultigraph;
import Multigraphs.Multigraph;

import java.util.Optional;

public class DirectedWeightedGraph<NodeId, NodeData, EdgeData> implements Graph<NodeId, NodeData, EdgeData>{
    private Multigraph<NodeId, NodeData, EdgeData> graph;

    public DirectedWeightedGraph(){
        graph = new DirectedWeightedMultigraph<>();
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
}
