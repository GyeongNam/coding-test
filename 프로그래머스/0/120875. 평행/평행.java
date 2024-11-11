import java.util.*;

class Solution {
    private boolean Giulgi(int[] dot1, int[] dot2, int[] dot3, int[] dot4) {
        int dx1 = dot2[0] - dot1[0];
        int dy1 = dot2[1] - dot1[1];
        int dx2 = dot4[0] - dot3[0];
        int dy2 = dot4[1] - dot3[1];
        return (dy1 * dx2) == (dy2 * dx1);
    }
    public int solution(int[][] dots) {
        List<int[]> combinations = new ArrayList<>();
        
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                combinations.add(new int[]{i, j});
            }
        }

        for (int i = 0; i < combinations.size(); i++) {
            for (int j = i + 1; j < combinations.size(); j++) {
                int[] pair1 = combinations.get(i);
                int[] pair2 = combinations.get(j);
                
                if (pair1[0] != pair2[0] && pair1[0] != pair2[1] && pair1[1] != pair2[0] && pair1[1] != pair2[1]) {

                    if (Giulgi(dots[pair1[0]], dots[pair1[1]], dots[pair2[0]], dots[pair2[1]])) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }
}