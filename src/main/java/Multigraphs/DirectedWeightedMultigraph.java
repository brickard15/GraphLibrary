package Multigraphs;

import Node.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DirectedWeightedMultigraph<NodeIdType, NodeData, EdgeType> implements Multigraph<NodeIdType, NodeData, EdgeType> {
    private final List<Node<NodeIdType, NodeData, EdgeType>> nodes;

    public DirectedWeightedMultigraph(){
        nodes = new ArrayList<>();
    }

    @Override
    public void addNode(final NodeIdType nodeId, final NodeData nodeData) {
        if (!hasNode(nodeId)){
            nodes.add(new Node<NodeIdType, NodeData, EdgeType>(nodeId, nodeData));
        }
    }

    @Override
    public int getNodeCount(){
        return nodes.size();
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

    @Override
    public Optional<NodeData> getNodeData(final NodeIdType nodeId){
        final Optional<NodeData>[] result = new Optional[]{Optional.empty()};

        nodes.forEach(node -> {
            if (node.getNodeID().equals(nodeId)){
                result[0] = Optional.of(node.getNodeData());
            }
        });

        return result[0];
    }

    @Override
    public void addEdge(NodeIdType nodeId1, NodeIdType nodeId2, EdgeType edgeData) {
        if (hasNode(nodeId1) && hasNode(nodeId2)){
            nodes.forEach(node -> {
                if (node.getNodeID().equals(nodeId1)){
                    node.addEdge(nodeId2, edgeData);
                }
            });
        }
    }

    @Override
    public boolean hasEdge(NodeIdType nodeIdType1, NodeIdType nodeIdType2) {
        final boolean[] result = {false};

        nodes.forEach(node -> {
            if (node.getNodeID().equals(nodeIdType1) && node.hasEdge(nodeIdType2)){
                result[0] = true;
            }
        });

        return result[0];
    }

    @Override
    public List<EdgeType> getEdgeData(NodeIdType node1Id, NodeIdType node2Id){
        List<EdgeType> edgeValues = new ArrayList<>();

        if (hasNode(node1Id) && hasNode(node2Id)){
            nodes.forEach(node -> {
                if (node.getNodeID().equals(node1Id) && node.hasEdge(node2Id)){
                    node.getEdgeData(node2Id).forEach(edgeData -> edgeValues.add(edgeData));
                }
            });
        }

        return edgeValues;
    }

    @Override
    public int getOutDegree(NodeIdType nodeId) {
        final int[] result = {0};
        nodes.forEach(node -> {
            if (node.getNodeID().equals(nodeId)){
                result[0] = node.getDegree();
            }
        });

        return result[0];
    }
}
