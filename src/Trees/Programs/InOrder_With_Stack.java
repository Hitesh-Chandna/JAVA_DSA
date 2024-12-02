package Trees.Programs;


import Trees.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder_With_Stack {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);

        List<Integer> traversal = inOrderTraversal(root);

        System.out.println("Inorder: " + traversal);
    }

    private static List<Integer> inOrderTraversal(Node root) {
        List<Integer> inOrder = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        while(true) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                if(stack.isEmpty()) {
                   break;
                }
                root = stack.pop();
                inOrder.add(root.data);
                root = root.right;
            }
        }
        return inOrder;
    }
}