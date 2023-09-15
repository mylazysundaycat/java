package AVL;

public class AVLTree<Key extends Comparable<Key>, Value> {
    public Node root;
    public Node getRoot() {return root;}
    public AVLTree(Key id, Value name){
        root = new Node(id, name, 0);
    }

    private Node rotateRight(Node n){
        Node x = n.left;
        n.left = x.right;
        x.right = n;
        //높이 갱신
        n.height = Math.max(height(n.left), height(n.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    private Node rotateLeft(Node n){
        Node x = n.right;
        n.right = x.left;
        x.left = n;
        //높이 갱신
        n.height = Math.max(height(n.left), height(n.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    public int size(Node n){
        if(n==null)
            return 0;
        else
            return (1+size(n.left)+size(n.right));
    }

    public int height(Node n){
        if(n==null)
            return 0;
        else
            return (1+Math.max(height(n.left),height(n.right)));
    }

    public void put(Key k, Value v){root=put(root,k,v);}
    private Node put(Node n, Key k, Value v){
        if(n==null) return new Node(k, v, 1);
        int t = k.compareTo((Key)n.id);
        if(t<0) n.left = put(n.left, k, v);
        else if(t>0)  n.right = put(n.right, k, v);
        else{
            n.name = v;
            return n;
        }
        n.height = Math.max(height(n.left),height(n.right))+1;
        return balnace(n);
    }

    public Node balnace(Node n){
        //노드 n의 왼쪽 서브트리가 높아서 불균형 발생
        if(bf(n)>1) {
            if(bf(n.left)<0){
                n.left = rotateLeft(n.left);
            }
            n = rotateRight(n);
        }
        //노드 n의 오른쪽 서브트리가 높아서 불균형 발생
        else if(bf(n)<-1) {
            if(bf(n.right)>0) {
                n.right = rotateRight(n.right);
            }
            n = rotateLeft(n);
        }
        return n;
    }

    private int bf(Node n){
        return height(n.left)-height(n.right);
    }
}
