import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int [][] board2 = new int[board.length][board[0].length];
        int Index = 0;
        for (int[] rows : board) {
            board2[Index] = Arrays.copyOf(rows, board[Index].length);
            Index++;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int val = board[i][j];
                
                // if(val == 0) continue;
                if(board[i][j] == 1){
                    for (int r = i - 1; r <= i + 1 ; r++) {
                    if(r < 0 || r >= board2.length) continue;

                    for (int c = j - 1; c <= j + 1; c++) {
                        if(c < 0 || c >= board2.length) continue;

                        board2[r][c] = 1;
                    }
                }
                }
                
                
            }
        }
        System.out.println(Arrays.deepToString(board2));
        for (int[] intlist : board2) {
            for (int list : intlist) {
                if(list == 0){
                    answer++;
                }                
            }
        }
        return answer;
    }
}