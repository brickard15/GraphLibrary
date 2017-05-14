import java.util.Optional;

public interface Graph <NodeType, EdgeType>{

    public boolean hasNode(NodeType node);
    public boolean hasEdge(NodeType node1, NodeType node2);
    public Optional<EdgeType> getEdge(NodeType node1, NodeType node2);
}
