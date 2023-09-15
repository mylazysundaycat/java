package BinarySearchTree;

public class BST<Key extends Comparable<Key>, Value> {
    public Node root;
    public Node getRoot() {return root;}
    public BST(Key id, Value name){
        root = new Node(id, name);
    }

    // 탐색 연산
    public Value get(Key k){return get(root,k);}
    public Value get(Node n, Key k){
        // k를 발견하지 못함
        if(n==null) return null;
        int t = n.getKey().compareTo(k);
        // k를 발견하기 위한 과정
        if(t>0) return get(n.getLeft(), k);
        else if(t<0) return get(n.getRight(), k);
        else return (Value)n.getValue();
    }

    //삽입 연산
    public void put(Key k, Value v) {root = put(root, k, v);}
    public Node put(Node n, Key k, Value v) {
        if(n==null) return new Node(k, v);
        int t = n.getKey().compareTo(k);

        if(t>0) n.setLeft(put(n.getLeft(), k, v));
        else if(t<0) n.setRight(put(n.getRight(), k, v));
        else n.setValue(v);
        return n;
    }

    //최솟값 찾기
    public Key min(){
        if(root==null) return null;
        return (Key)min(root).getKey();
    }
    private Node min(Node n){
        if(n.getLeft()==null) return n;
        return min(n.getLeft());
    }

    //최솟값 삭제 연산
    public void deleteMin(){
        if(root==null) System.out.println("empty트리");
        root=deleteMin(root);
    }
    public Node deleteMin(Node n){
        if(n.getLeft()==null) return n.getRight();
        n.setLeft(deleteMin(n.getLeft()));
        return n;
    }

    //삭제 연산
    public void delete(Key k) {root=delete(root, k);}
    public Node delete(Node n, Key k) {
        if(n==null) return null;
        int t = n.getKey().compareTo(k);

        if(t>0) n.setLeft(delete(n.getLeft(), k));
        else if(t<0) n.setRight(delete(n.getRight(), k));
        else {
            if(n.getRight()==null) return n.getLeft(); // case 0,1
            if(n.getLeft()==null) return n.getRight(); // case 1
            Node target = n; // case 2
            n = min(target.getRight()); // n을 target의 중위후속자로 입력
            //target의 중위후속자를 삭제한 오른쪽 서브트리를 n의 오른쪽 서브트리로 셋팅
            n.setRight(deleteMin(target.getRight()));
            n.setLeft(target.getLeft());
        }
        return n;
    }


}
