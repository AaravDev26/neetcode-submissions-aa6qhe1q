class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                if (seen.contains(board[row][col])) {
                    return false;
                }
                if (board[row][col] != '.') {
                    seen.add(board[row][col]);
                }
            }
        }
        for (int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                if (seen.contains(board[row][col])) {
                    return false;
                }
                if (board[row][col] != '.') {
                    seen.add(board[row][col]);
                }
            }
        }
        boolean s1 = isValidSquare(board, 0, 0);
        boolean s2 = isValidSquare(board, 3, 0);
        boolean s3 = isValidSquare(board, 6, 0);
        boolean s4 = isValidSquare(board, 0, 3);
        boolean s5 = isValidSquare(board, 0, 6);
        boolean s6 = isValidSquare(board, 3, 3);
        boolean s7 = isValidSquare(board, 3, 6);
        boolean s8 = isValidSquare(board, 6, 3);
        boolean s9 = isValidSquare(board, 6, 6);
        
        return s1 && s2 && s3 && s4 && s5 && s6 && s7 && s8 && s9;
    }

    private boolean isValidSquare(char[][] board, int r, int c) {
        Set<Character> seen = new HashSet<>();
        for (int row = r; row < r + 3; row++) {
            for (int col = c; col < c + 3; col++) {
                if (seen.contains(board[row][col])) {
                    return false;
                }
                if (board[row][col] != '.') {
                    seen.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
