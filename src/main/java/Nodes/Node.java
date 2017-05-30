package Nodes;

import java.util.HashMap;

public class Node <NodeType, EdgeType>{

    private final NodeType nodeData;
    private final HashMap<Integer, EdgeType> edges;

    public Node(NodeType nodeData){
        this.nodeData = nodeData;
        edges = new HashMap<>();
    }

    public void addEdge(int otherNodeID, EdgeType edgeData){

    }

    public boolean hasEdge(int otherNodeID){
        return false;
    }

    //TODO: Maybe this should just be an index.
    //TODO: Also maybe it should return an optional? But optionals don't work with ints.
    public int getNodeID(){
        return 0;
    }
}
