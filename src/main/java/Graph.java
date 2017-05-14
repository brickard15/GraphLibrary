public interface Graph <NodeType, EdgeType>{

    public boolean hasNode(final NodeType node);
    public boolean hasEdge(final NodeType node1, final NodeType node2);
    public void addNode(final NodeType node);
    public void addEdge(final NodeType node1, final NodeType node2);
}
