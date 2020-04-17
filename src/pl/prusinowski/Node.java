package pl.prusinowski;

public class Node {
    int value;
    Node node=null;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode( Node node) {
        this.node = node;
    }
}
