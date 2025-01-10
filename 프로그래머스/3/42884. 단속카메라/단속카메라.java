import java.io.*;
import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int camera = routes[0][1];

        for(int[] route : routes){
            if(camera < route[0]){
                camera = route[1];
                answer++;
            }
        }
        return answer;
    }
}