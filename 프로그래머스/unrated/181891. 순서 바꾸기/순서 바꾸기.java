import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] intArray1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] intArray2 = Arrays.copyOfRange(num_list, 0, n);
        System.arraycopy(intArray1, 0, answer, 0, intArray1.length);
        System.arraycopy(intArray2, 0, answer, intArray1.length, intArray2.length);
        return answer;
    }
}