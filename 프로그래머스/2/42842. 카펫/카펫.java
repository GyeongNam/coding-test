class Solution {
    public int[] solution(int brown, int yellow) {
//         int[] answer = new int[2];
//         int num = brown + yellow;
//         for (int i = 3; i < num; i++) {
//             int j = num / i;
//             if (num % i == 0 && j >= 3) {
//                 int col = Math.max(i, j);
//                 int row = Math.min(i, j);
//                 int center = (col - 2) * (row - 2);

//                 if (center == yellow) {
//                     answer[0] = col;
//                     answer[1] = row;
//                     return answer;
//                 }
//             }
//         }
//         return answer;
        int[] answer = new int[2];
        int carpet = brown + yellow;
        for (int i = 3; i <= carpet; i++) {
            int col = i;
            int row = carpet / col; 
 
            if (row < 3) {
                continue;
            }
 
            if (row >= col) {
                if ((row - 2) * (col - 2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
        }
        return answer;
    }
}