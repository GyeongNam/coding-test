class Solution {
    private boolean Giulgi(int[] dot1, int[] dot2, int[] dot3, int[] dot4) {
        return (dot2[1] - dot1[1]) * (dot4[0] - dot3[0]) == (dot4[1] - dot3[1]) * (dot2[0] - dot1[0]);
    }

    public int solution(int[][] dots) {
        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                for (int k = 0; k < dots.length - 1; k++) {
                    for (int l = k + 1; l < dots.length; l++) {
                        if (i != k && i != l && j != k && j != l) {
                            if (Giulgi(dots[i], dots[j], dots[k], dots[l])) {
                                return 1; 
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}
