import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i<size; i++){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            int floor = num % h;
            if (floor == 0) {
                floor = h;
            }

            int roomNumber = (num - 1) / h + 1;

            System.out.println(floor * 100 + roomNumber);
        }
    }
}