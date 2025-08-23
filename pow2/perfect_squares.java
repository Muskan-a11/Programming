package pow2;
import java.util.*;
class perfect_squares {

    
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        // Precompute all perfect squares <= n
        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            squares.add(i * i);
        }
        
        // DP transition
        for (int i = 1; i <= n; i++) {
            for (int sq : squares) {
                if (sq > i) break;
                dp[i] = Math.min(dp[i], dp[i - sq] + 1);
            }
        }
        
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println(numSquares(n));
        
        sc.close();
    }
}

