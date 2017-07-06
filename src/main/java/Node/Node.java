package Node;

import fj.P2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Node <NodeDataType, NodeIDType, EdgeType> implements Iterable<P2<NodeIDType, EdgeType>>{
    private final NodeDataType nodeData;
    private final List<P2<NodeIDType, EdgeType>> edges;
    private final NodeIDType nodeID;

    public Node(NodeDataType nodeData, NodeIDType nodeID){
        this.nodeData = nodeData;
        edges = new ArrayList<>();
        this.nodeID = nodeID;
    }

    public void addEdge(NodeIDType otherNodeID, EdgeType edgeData){
        edges.add(new P2<NodeIDType, EdgeType>() {
            @Override
            public NodeIDType _1() {
                return otherNodeID;
            }

            @Override
            public EdgeType _2() {
                return edgeData;
            }
        });
    }

    protected List<P2<NodeIDType, EdgeType>> getEdges(){
        return edges;
    }

    public List<P2<NodeIDType, EdgeType>> getEdges(NodeIDType otherNodeID){
        List<P2<NodeIDType, EdgeType>> possibleEdges = new ArrayList<>();

        forEach(edge -> {
            if (edge._1().equals(otherNodeID)){
                possibleEdges.add(edge);
            }
        });

        return possibleEdges;
    }

    public boolean hasEdge(NodeIDType otherNodeID){
        final boolean[] result = {false};

        forEach(edgeTuple -> {
            if (edgeTuple._1().equals(otherNodeID)){
                result[0] = true;
            }
        });

        return result[0];
    }

    public NodeIDType getNodeID(){
        return nodeID;
    }

    public NodeDataType getNodeData(){
        return nodeData;
    }

    @Override
    public Iterator<P2<NodeIDType, EdgeType>> iterator() {
        return edges.iterator();
    }
}
