public class flood_fill_algo {
     // Flood Fill function
    public static void floodFill(char[][] image, int sr, int sc, char newColor) {
        int rows = image.length;
        int cols = image[0].length;

        char originalColor = image[sr][sc];

        // If the new color is same as the original, no need to do anything
        if (originalColor == newColor) return;

        // Start DFS
        dfs(image, sr, sc, originalColor, newColor, rows, cols);
    }

    // DFS helper
    private static void dfs(char[][] image, int r, int c, char originalColor, char newColor, int rows, int cols) {
        // Boundary checks
        if (r < 0 || r >= rows || c < 0 || c >= cols) return;

        // If not the original color, stop
        if (image[r][c] != originalColor) return;

        // Change the color
        image[r][c] = newColor;

        // Explore 4 directions
        dfs(image, r + 1, c, originalColor, newColor, rows, cols); // down
        dfs(image, r - 1, c, originalColor, newColor, rows, cols); // up
        dfs(image, r, c + 1, originalColor, newColor, rows, cols); // right
        dfs(image, r, c - 1, originalColor, newColor, rows, cols); // left
    }

    // Utility function to print matrix
    public static void printImage(char[][] image) {
        for (char[] row : image) {
            for (char pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {
        char[][] image = {
            {'B', 'B', 'W'},
            {'W', 'W', 'W'},
            {'W', 'W', 'W'},
            {'B', 'B', 'B'}
        };

        int sr = 2, sc = 2;
        char newColor = 'G';

        System.out.println("Original Image:");
        printImage(image);

        floodFill(image, sr, sc, newColor);

        System.out.println("\nImage after Flood Fill:");
        printImage(image);
    }
}
