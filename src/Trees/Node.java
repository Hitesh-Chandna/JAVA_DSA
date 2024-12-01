package Trees;

public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
    }
    
    public Node(int val, Node left, Node right) {
        data = val;
        this.left = left;
        this.right = right;
    }
}
