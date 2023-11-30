class Solution {
    public int solution(String[][] board, int h, int w) {
        
        int n = board.length;    // 1
        
        int count = 0;      // 2
        
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};   // 3
        
        for(int i = 0; i<=3; i++){  // 4
            
            int h_check = h + dh[i];
            int w_check = w + dw[i];    // 4-1
            
            if(h_check >= 0 && h_check < n && w_check >= 0 && w_check < n){ // 4-2
                if(board[h][w].equals(board[h_check][w_check])){ // 4-2-a
                    count++;
                }
            }
        }
        return count;   // 5
    }
}