package Graphs;

import Node.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DirectedWeightedGraph <NodeIdType, NodeData, EdgeType> implements Graph <NodeIdType, NodeData, EdgeType> {
    private final List<Node<NodeIdType, NodeData, EdgeType>> nodes;

    public DirectedWeightedGraph(){
        nodes = new ArrayList<>();
    }


    @Override
    public boolean hasNode(NodeIdType nodeId) {
        final boolean[] result = {false};

        nodes.forEach(node -> {
            if (node.getNodeID().equals(nodeId)){
                result[0] = true;
            }
        });

        return result[0];
    }

    public Optional<NodeData> getNodeData(final NodeIdType nodeId){
        final Optional<NodeData>[] result = new Optional[]{Optional.empty()};

        nodes.forEach(node -> {
            if (node.getNodeID().equals(nodeId)){
                result[0] = Optional.of(node.getNodeData());
            }
        });

        return result[0];
    }

    public int getNodeCount(){
        return nodes.size();
    }

    @Override
    public boolean hasEdge(NodeIdType nodeIdType1, NodeIdType nodeIdType2) {
        return false;
    }

    @Override
    public void addNode(final NodeIdType nodeId, final NodeData nodeData) {
        if (!hasNode(nodeId)){
            nodes.add(new Node<NodeIdType, NodeData, EdgeType>(nodeId, nodeData));
        }
    }

    @Override
    public void addEdge(NodeIdType nodeId1, NodeIdType NodeId2, EdgeType edgeData) {

    }
}
