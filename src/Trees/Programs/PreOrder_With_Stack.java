package Trees.Programs;


import Trees.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder_With_Stack {

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);

        List<Integer> traversal = preOrderTraversal(root);

        System.out.println("Preorder: " + traversal);
    }

    private static List<Integer> preOrderTraversal(Node root) {
        List<Integer> preOrder = new ArrayList<>();
        if (root == null) return preOrder;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            preOrder.add(root.data);
            if (null != root.right) stack.push(root.right);
            if (null != root.left) stack.push(root.left);
        }
        return preOrder;
    }
}