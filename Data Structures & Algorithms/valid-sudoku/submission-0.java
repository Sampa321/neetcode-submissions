class Solution {
    public boolean isValidSudoku(char[][] board) {

        //For row
        for(int i = 0; i < board.length; i++)
        {
            Set<Character> set1 = new HashSet<>();
            for(int j = 0; j < board[i].length; j++)
            {
                if(board[i][j] == '.') continue;
                if(set1.contains(board[i][j])) return false;
                set1.add(board[i][j]);
            }
        }

        //For column
        for(int j = 0; j < board.length; j++)
        {
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < board[j].length; i++)
            {
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }

        //For square
        int size = (int)Math.sqrt(board.length);
        for(int square = 0; square < board.length; square++)
        {
            HashSet<Character> set = new HashSet<>();
            for(int i = 0; i < size; i++)
            {
                for(int j = 0; j < size; j++)
                {
                    int row = (square / size) * size+i;
                    int column = (square % size) * size+j;
                    if(board[row][column] == '.') continue;
                    if(set.contains(board[row][column])) return false;
                    set.add(board[row][column]);
                }
            }
        }
        return true;
    }
}
