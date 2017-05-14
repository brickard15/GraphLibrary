package Nodes;

public interface Node <NodeType, EdgeType>{
    public void addEdge(NodeType node1);
    public void addEdge(NodeType node1, EdgeType edge);
}
