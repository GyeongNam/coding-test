import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] newArray = new int[n];

        System.arraycopy(num_list, 0, newArray, 0, n);
        return newArray;
    }
}