package AVL;

public class Node<Key extends Comparable<Key>, Value> {
    public Key id;
    public Value name;
    public int height;
    public Node left, right;
    public Node(Key id, Value name, int height){
        this.id = id;
        this.name = name;
        this.height = height;
        left = right = null;
    }
}
