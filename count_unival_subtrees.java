public class count_unival_subtrees {
    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
            left = right = null;
        }
    }

    // Global counter for unival subtrees
    private static int count = 0;

    public static int countUnivalSubtrees(TreeNode root) {
        count = 0; // reset for each call
        isUnival(root);
        return count;
    }

    // Helper function to check if a subtree is unival
    private static boolean isUnival(TreeNode node) {
        if (node == null) return true; // Null is trivially unival

        // Post-order: check left and right subtrees first
        boolean left = isUnival(node.left);
        boolean right = isUnival(node.right);

        // If either left or right is not unival, current cannot be unival
        if (!left || !right) return false;

        // Check if left child exists and has same value
        if (node.left != null && node.left.val != node.val) return false;

        // Check if right child exists and has same value
        if (node.right != null && node.right.val != node.val) return false;

        // If passed all checks, this node is a unival subtree
        count++;
        return true;
    }

    // Example usage
    public static void main(String[] args) {
        /*
            Example tree:
                  0
                 / \
                1   0
                   / \
                  1   0
                 / \
                1   1
        */
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(0);
        root.right.left.left = new TreeNode(1);
        root.right.left.right = new TreeNode(1);

        System.out.println("Number of Unival Subtrees: " + countUnivalSubtrees(root));
        // Expected Output: 5
    }
}   
