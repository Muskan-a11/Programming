package pow2;

public class max_path {

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }
    
    private static int maxSum;  // Global max

    public static int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        helper(root);
        return maxSum;
    }
    
    private static int helper(TreeNode node) {
        if (node == null) return 0;
        
        // Compute max path from left and right children, ignore negatives
        int left = Math.max(helper(node.left), 0);
        int right = Math.max(helper(node.right), 0);
        
        // Path passing through current node
        int current = node.val + left + right;
        
        // Update global max
        maxSum = Math.max(maxSum, current);
        
        // Return best downward path (to be used by parent)
        return node.val + Math.max(left, right);
    }

    public static void main(String[] args) {
        // Example: build the tree [-10,9,20,null,null,15,7]
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxPathSum(root)); // Output: 42
    }
}


