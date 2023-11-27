import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int[] delete_list) {
        ArrayList answer = new ArrayList<>();
        ArrayList delete = new ArrayList<>();
        for (int num : arr) {
            answer.add(num);
        }
        for (int num : delete_list) {
            delete.add(num);
        }
        answer.removeAll(delete);
        return answer;
    }
}