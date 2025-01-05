import java.io.*;
import java.util.*;

public class Main {

    static int count = 0;

    private static void zed(int N, int r, int c) {
        int size = 1 << N; // 2^N

        while (size > 1) {
            int half = size / 2;
            int quadrant = 0;

            if (r >= half) {
                r -= half;
                quadrant += 2;
            }
            if (c >= half) {
                c -= half;
                quadrant += 1;
            }

            count += quadrant * half * half;
            size = half;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        zed(N, r, c);
        System.out.println(count);
    }
}
