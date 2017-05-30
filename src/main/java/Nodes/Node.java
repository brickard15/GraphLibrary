package Nodes;

import java.util.HashMap;

public class Node <NodeDataType, NodeIDType, EdgeType>{

    private final NodeDataType nodeData;
    private final HashMap<Integer, EdgeType> edges;
    private final NodeIDType nodeID;

    public Node(NodeDataType nodeData, NodeIDType nodeID){
        this.nodeData = nodeData;
        edges = new HashMap<>();
        this.nodeID = nodeID;
    }

    public void addEdge(int otherNodeID, EdgeType edgeData){

    }

    public boolean hasEdge(int otherNodeID){
        return false;
    }

    //TODO: Maybe this should just be an index.
    public NodeIDType getNodeID(){
        return nodeID;
    }
}
