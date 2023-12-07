import java.util.*;
class Solution {
    //결과의 열 길이는 arr1의 행 길이, arr2의 열 길이와 같습니다!
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2[0].length; j++){
                for(int x = 0; x<arr2.length;  x++){
                    answer[i][j] += arr1[i][x] * arr2[x][j];
                }
                
            }
        }
    
        return answer;
    }
}