package Node;

import fj.P2;

import java.util.ArrayList;
import java.util.List;

public class Node <NodeDataType, NodeIDType, EdgeType>{
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

    public boolean hasEdge(NodeIDType otherNodeID){
        final boolean[] result = {false};

        edges.forEach(edgeTuple -> {
            if (edgeTuple._1().equals(otherNodeID)){
                result[0] = true;
            }
        });

        return result[0];
    }

    public NodeIDType getNodeID(){
        return nodeID;
    }
}
