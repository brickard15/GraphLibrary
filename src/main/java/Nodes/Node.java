package Nodes;

public class Node <NodeType>{

    private final NodeType nodeData;

    private Node(NodeType nodeData){
        this.nodeData = nodeData;
    }

    public void addEdge(int otherNodeID){

    }

    public boolean hasEdge(int otherNodeID){
        return false;
    }

    public int getNodeID(){
        return 0;
    }
}
