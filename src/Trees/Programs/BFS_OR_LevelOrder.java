package Trees.Programs;

import Trees.Node;

import java.util.*;

public class BFS_OR_LevelOrder {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<List<Integer>> output = levelOrder(root);
        System.out.print("BFS Traversal: ");
        output.stream().flatMap(Collection::stream).forEach(item -> System.out.print(item + " "));
    }

    private static List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();

        if (root == null)
            return list;

        queue.offer(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i < level; i++) {
                if (queue.peek() != null && queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek() != null && queue.peek().right != null) queue.offer(queue.peek().right);

                subList.add(queue.poll().data);
            }
            list.add(subList);
        }
        return list;
    }
}
