package Trees.Programs;

import Trees.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InOrder {
    //Inorder - Left, Root, Right

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> arr = inorderTraversal(root);
        System.out.println("Inorder Traversal: "+ arr);
    }

    private static List<Integer> inorderTraversal(Node root) {
        List<Integer> arr = new ArrayList<>();
        inOrder(root, arr);
        return arr;
    }

    private static void inOrder(Node root, List<Integer> arr) {
        if(Objects.isNull(root)) {
            return;
        }
        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }
}
