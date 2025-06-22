import java.util.*;

class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

public class TreeTraversal {

    // DFS - In-order Traversal
    public static List<Integer> dfsInOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfsHelper(root, result);
        return result;
    }

    private static void dfsHelper(TreeNode node, List<Integer> result) {
        if (node != null) {
            dfsHelper(node.left, result);
            result.add(node.value);
            dfsHelper(node.right, result);
        }
    }

    // BFS - Level Order Traversal
    public static List<Integer> bfs(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            result.add(curr.value);

            if (curr.left != null) queue.offer(curr.left);
            if (curr.right != null) queue.offer(curr.right);
        }

        return result;
    }

    // Method to test the traversals
    public static void runTest() {
        /*
                10
               /  \
              5   15
             / \    \
            3   7   20
        */
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(20);

        // Expected DFS in-order: 3, 5, 7, 10, 15, 20
        // Expected BFS level-order: 10, 5, 15, 3, 7, 20
        List<Integer> expectedDFS = Arrays.asList(3, 5, 7, 10, 15, 20);
        List<Integer> expectedBFS = Arrays.asList(10, 5, 15, 3, 7, 20);

        System.out.println("DFS In-Order: " + dfsInOrder(root));
        System.out.println("PASS: " + dfsInOrder(root).equals(expectedDFS));

        System.out.println("BFS Level-Order: " + bfs(root));
        System.out.println("PASS: " + bfs(root).equals(expectedBFS));
    }

    public static void main(String[] args) {
        runTest();
    }
}
