# problem : minimum perfect squares 
Logic / Approach

Similar to coin change (min coins).

Use DP:

dp[i] = minimum number of perfect squares to form i.

Transition: dp[i] = min(dp[i], dp[i - sq] + 1) for all squares sq ≤ i.

Precompute all squares ≤ n.

Answer = dp[n].

Time Complexity

O(n√n) → for each i, try up to √n squares.

Space Complexity

O(n) → DP array of size n+1.

# problem : mis`ere nums 
Logic / Approach

Case 1: All heaps = 1

First player wins iff number of heaps is even.

For 3 heaps → odd → first player loses.

Case 2: At least one heap ≥ 2

Same rule as normal Nim:

Compute nim-sum = a ^ b ^ c.

If nim-sum ≠ 0 → first player wins.

Else → first player loses.

Time Complexity

O(1) (just XOR and a check).

Space Complexity

O(1).

# problem : maximum path sum
Logic / Approach

Use post-order DFS traversal.

For each node:

Compute max downward path from left & right (ignore negatives).

Path through current node = node.val + left + right.

Update global maximum.

Return node.val + max(left, right) to parent (since path can extend in one direction).

Final result = global maximum.

Time Complexity

O(N) → visit each node once.

Space Complexity

O(H) → recursion stack, where H = height of tree.