public interface Graph <NodeType, EdgeType>{

    public boolean hasNode(NodeType node);
    public boolean hasEdge(NodeType node1, NodeType node2);
    public void addNode(NodeType node);
}
