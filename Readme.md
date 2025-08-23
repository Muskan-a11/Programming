# Problem: Find the greatest common divisor (GCD) of two numbers.
Logic

Use Euclidean Algorithm:

GCD(a, b) = a if b == 0

Else GCD(a, b) = GCD(b, a % b)

Compute GCD of all elements by iteratively applying the above.

⏱ Time Complexity

Each GCD: O(log(min(a, b)))

For n numbers: O(n · log(min(array elements)))

 Space Complexity

Extra variables: O(1)

Recursion stack: O(log(min(a, b)))


 # Problem :flood fill algorithm
 Logic

Use DFS (Depth-First Search) to replace all connected pixels of the starting color with the new color.

Steps:

Check boundary conditions.

If pixel matches the original color, change it to the new color.

Recursively explore in 4 directions (up, down, left, right).

If the original color is the same as the new color → do nothing.

⏱️ Time Complexity

Each cell is visited once → O(m × n) for an image of size m × n.

💾 Space Complexity

Recursive DFS stack can go as deep as O(m × n) in the worst case.

No extra data structures → O(1) additional space.

# Problem : deep clone linked list
Logic

Each node has a next and a random pointer.

Optimized cloning steps:

Insert cloned nodes right after each original node.

Set cloned nodes’ random pointers using curr.next.random = curr.random.next.

Separate original and cloned lists.

⏱️ Time Complexity

Each node processed 3 times → O(n)

💾 Space Complexity

No extra data structures used → O(1)

# Problem : EqualSum Partition
Logic

Goal: Check if the array can be partitioned into two subsets with equal sum.

Steps:

Compute total sum. If it’s odd, partition is impossible.

Target = sum / 2.

Use DP (subset sum): dp[j] = true if subset with sum j can be formed.

Iterate through numbers, update DP array in reverse to avoid reuse.

If dp[target] is true → partition possible.

⏱️ Time Complexity

For n elements and target sum S = sum/2:
O(n × S)

💾 Space Complexity

1D DP array of size S+1:
O(S)

# Problem : Count Unival Subtrees
Logic

A Unival subtree is a subtree where all nodes have the same value.

Approach (DFS, post-order):

Recurse into left and right subtrees.

If either is not unival → current subtree is not unival.

If children exist but have different values than the parent → not unival.

Otherwise, increment global counter and mark subtree as unival.

⏱️ Time Complexity

Each node is visited once → O(n)

💾 Space Complexity

Recursion stack in worst case (skewed tree) → O(h), where h = tree height.

# Problem : Word Search In 2D matrix
Logic

Goal: Check if a given word exists horizontally (row-wise) or vertically (column-wise) in a 2D matrix.

Steps:

Traverse each row, convert to string, and check if it contains the word.

Traverse each column, build string, and check if it contains the word.

If found in any row/column → return true, else false.

⏱️ Time Complexity

Row check: O(M × N)

Column check: O(M × N)

Total: O(M × N), where M = rows, N = columns.

💾 Space Complexity

Extra space for temporary row/column strings: O(max(M, N))
