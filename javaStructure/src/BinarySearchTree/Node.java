package BinarySearchTree;

public class Node<Key extends Comparable<Key>, Value> {
    private Key id;

    private Value name;

    private Node left, right;

    public Node(Key id, Value name) {
        this.id = id;
        this.name = name;
        left = right = null;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Key getKey() {
        return id;
    }

    public Value getValue() {
        return name;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setKey(Key id) {
        this.id = id;
    }

    public void setValue(Value name) {
        this.name = name;
    }
}
