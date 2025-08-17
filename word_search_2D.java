public class word_search_2D {
    public static boolean wordExists(char[][] matrix, String word) {
        int M = matrix.length;        // number of rows
        int N = matrix[0].length;     // number of columns

        // 1. Check each row (left-to-right)
        for (int i = 0; i < M; i++) {
            String row = new String(matrix[i]);  // convert row to string
            if (row.contains(word)) {
                return true;
            }
        }

        // 2. Check each column (top-to-bottom)
        for (int j = 0; j < N; j++) {
            StringBuilder col = new StringBuilder();
            for (int i = 0; i < M; i++) {
                col.append(matrix[i][j]);
            }
            if (col.toString().contains(word)) {
                return true;
            }
        }

        // Word not found in any row or column
        return false;
    }

    // Example test
    public static void main(String[] args) {
        char[][] matrix = {
            {'F', 'A', 'C', 'I'},
            {'O', 'B', 'Q', 'P'},
            {'A', 'N', 'O', 'B'},
            {'M', 'A', 'S', 'S'}
        };

        String word1 = "FOAM";
        String word2 = "MASS";
        String word3 = "FACE";

        System.out.println(wordExists(matrix, word1)); // true
        System.out.println(wordExists(matrix, word2)); // true
        System.out.println(wordExists(matrix, word3)); // false
    }
}
