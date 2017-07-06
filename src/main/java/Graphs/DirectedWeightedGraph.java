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
    public boolean hasNode(Object nodeId) {
        return false;
    }

    @Override
    public boolean hasEdge(Object nodeIdType1, Object nodeIdType2) {
        return false;
    }

    @Override
    public void addNode(Object nodeData, Object nodeId) {

    }

    @Override
    public void addEdge(Object nodeId1, Object NodeId2, Object edgeData) {

    }
}
