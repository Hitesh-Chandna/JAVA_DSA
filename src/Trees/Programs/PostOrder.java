package Trees.Programs;

import Trees.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PostOrder {
    //Postorder - Left, Right, Root

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> arr = postorderTraversal(root);
        System.out.println("Postorder Traversal: "+ arr);
    }

    private static List<Integer> postorderTraversal(Node root) {
        List<Integer> arr = new ArrayList<>();
        postOrder(root, arr);
        return arr;
    }

    private static void postOrder(Node root, List<Integer> arr) {
        if(Objects.isNull(root)) {
            return;
        }
        postOrder(root.left, arr);
        postOrder(root.right, arr);
        arr.add(root.data);
    }
}
