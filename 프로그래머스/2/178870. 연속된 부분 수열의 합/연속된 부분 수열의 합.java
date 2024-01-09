import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int sum = 0;
        int start = 0;
        int length = Integer.MAX_VALUE;
        for (int end = 0; end < sequence.length; end++) {
            sum += sequence[end];
            // 함이 k랑 같다면
            if (sum == k) {
                // 길이가 작으면
                if (length > (end - start)) {
                    answer[0] = start;
                    answer[1] = end;
                    length = (end - start);
                }
            }
            else if (sum > k) {
                for (int j = start; j <= end; j++) {
                    sum -= sequence[j];
                    if (sum <= k) {
                        start = j + 1;
                        break;
                    }
                }
                if (sum == k) {
                    if (length > (end - start)) {
                        answer[0] = start;
                        answer[1] = end;
                        length = end - start;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}