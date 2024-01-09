import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
//         int[] answer = new int[2];
//         int sum = 0;
//         int start = 0;
//         int length = Integer.MAX_VALUE;
//         for (int end = 0; end < sequence.length; end++) {
//             sum += sequence[end];
//             if (sum == k) {
//                 if (length > (end - start)) {
//                     length = (end - start);
//                     answer[0] = start;
//                     answer[1] = end;
                
//                 }
//             }
//             else if (sum > k) {
//                 for (int j = start; j <= end; j++) {
//                     sum -= sequence[j];
//                     if (sum <= k) {
//                         start = j + 1;
//                         break;
//                     }
//                 }
//                 if (sum == k) {
//                     if (length > (end - start)) {
//                         length = end - start;
//                         answer[0] = start;
//                         answer[1] = end;
                        
//                     }
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(answer));
        
        
//         int[] answer = new int[2];
//         int min_len = Integer.MAX_VALUE;
// 		int end_point = 0;
// 		int start_point = 0;
// 		int sum = sequence[0];

// 		while (true) {
// 			if (sum == k) { 
// 				if (min_len > end_point - start_point) { 
// 					answer[0] = start_point;
// 					answer[1] = end_point; 
// 					min_len = end_point - start_point; 
// 				}
// 				sum -= sequence[start_point++];
// 			}
// 			if (sum > k) {
// 				sum -= sequence[start_point++];
// 			}
// 			if (sum < k) { 
// 				if (end_point == sequence.length - 1) {
// 					break;
// 				}
// 				if (end_point < sequence.length - 1) {
// 					sum += sequence[++end_point];
// 				}
// 			}
// 		}
        
        int[] answer = new int[2];
        int sum = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < sequence.length; end++) {
            sum += sequence[end];

            while (sum > k) {
                sum -= sequence[start];
                start++;
            }

            if (sum == k) {
                if (end - start < minLength) {
                    minLength = end - start;
                    answer[0] = start;
                    answer[1] = end;
                }
            }
        }

        return minLength == Integer.MAX_VALUE ? new int[0] : answer;
    }
}