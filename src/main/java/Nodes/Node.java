package Nodes;

public interface Node <NodeType, EdgeType>{
    public void addEdge(NodeType node);
    public boolean hasEdge(NodeType node);
}
