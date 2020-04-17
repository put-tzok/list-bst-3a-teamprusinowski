package pl.prusinowski;

public class BstNode {
    private int value;
    private BstNode left;
    private BstNode right;

    public BstNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BstNode getLeft() {
        return left;
    }

    public void setLeft(BstNode left) {
        this.left = left;
    }

    public BstNode getRight() {
        return right;
    }

    public void setRight(BstNode right) {
        this.right = right;
    }

    public void clean(){
        this.value =0;
        this.left = null;
        this.right = null;
    }
}
