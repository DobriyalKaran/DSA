import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                char ch = board[i][j];

                if (ch == '.')
                    continue;

                // Row
                if (!set.add("R" + i + ch))
                    return false;

                // Column
                if (!set.add("C" + j + ch))
                    return false;

                // Box
                if (!set.add("B" + (i / 3) + (j / 3) + ch))
                    return false;
            }
        }

        return true;
    }
}