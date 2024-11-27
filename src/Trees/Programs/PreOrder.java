package Trees.Programs;

import Trees.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PreOrder {
    //Preorder - Root, Left, Right

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> arr = preorderTraversal(root);
        System.out.println("Preorder Traversal: "+ arr);
    }

    private static List<Integer> preorderTraversal(Node root) {
        List<Integer> arr = new ArrayList<>();
        preOrder(root, arr);
        return arr;
    }

    private static void preOrder(Node root, List<Integer> arr) {
        if(Objects.isNull(root)) {
            return;
        }
        arr.add(root.data);
        preOrder(root.left, arr);
        preOrder(root.right, arr);
    }
}
