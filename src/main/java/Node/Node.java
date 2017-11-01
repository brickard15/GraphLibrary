package Node;

import fj.P2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Node <NodeIdType, NodeDataType, EdgeType> implements Iterable<P2<NodeIdType, EdgeType>>{
    private final NodeIdType nodeID;
    private final NodeDataType nodeData;
    private final List<P2<NodeIdType, EdgeType>> edges;

    public Node(NodeIdType nodeID, NodeDataType nodeData){
        this.nodeID = nodeID;
        this.nodeData = nodeData;
        edges = new ArrayList<>();
    }

    public void addEdge(NodeIdType otherNodeID, EdgeType edgeData){
        edges.add(new P2<NodeIdType, EdgeType>() {
            @Override
            public NodeIdType _1() {
                return otherNodeID;
            }

            @Override
            public EdgeType _2() {
                return edgeData;
            }
        });
    }

    protected List<P2<NodeIdType, EdgeType>> getEdges(){
        return edges;
    }

    public List<P2<NodeIdType, EdgeType>> getEdges(NodeIdType otherNodeID){
        List<P2<NodeIdType, EdgeType>> possibleEdges = new ArrayList<>();

        forEach(edge -> {
            if (edge._1().equals(otherNodeID)){
                possibleEdges.add(edge);
            }
        });

        return possibleEdges;
    }

    public boolean hasEdge(NodeIdType otherNodeID){
        final boolean[] result = {false};

        forEach(edgeTuple -> {
            if (edgeTuple._1().equals(otherNodeID)){
                result[0] = true;
            }
        });

        return result[0];
    }

    public List<EdgeType> getEdgeData(NodeIdType otherNodeId){
        final List<EdgeType> result = new ArrayList<>();

        if (hasEdge(otherNodeId)){
            edges.forEach(edge -> {
                if (edge._1().equals(otherNodeId)){
                    result.add(edge._2());
                }
            });
        }

        return result;
    }

    public NodeIdType getNodeID(){
        return nodeID;
    }

    public NodeDataType getNodeData(){
        return nodeData;
    }

    @Override
    public Iterator<P2<NodeIdType, EdgeType>> iterator() {
        return edges.iterator();
    }
}
