package Graphs;

import Node.Node;
import NodeIdGenerators.NodeIdGenerator;

import java.util.ArrayList;
import java.util.List;

public class DirectedWeightedGraph <NodeType, NodeIdType, EdgeType> implements Graph <NodeType, NodeIdType, EdgeType> {
    private final List<Node<NodeType, NodeIdType, EdgeType>> nodes;

    public DirectedWeightedGraph(){
        nodes = new ArrayList<>();
    }


    @Override
    public boolean hasNode(NodeIdType nodeId) {
        return false;
    }

    @Override
    public boolean hasEdge(NodeIdType nodeIdType1, NodeIdType nodeIdType2) {
        return false;
    }

    @Override
    public void addNode(NodeType nodeData, NodeIdType nodeId) {

    }

    @Override
    public void addEdge(NodeIdType nodeId1, NodeIdType NodeId2, EdgeType edgeData) {

    }
}
