import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int i, j = 1;
        for (i = 1; i < a; i++) {
            if (a == 1) {
                System.out.println(i);
            }
            a -= i;
        }
        if ((i % 2) == 0) {
            a--;
            while (a != 0) {
                i--;
                j++;
                a--;
            }
            System.out.println(j+ "/" + i);
        }
        else {
            a = i - a;
            while (a != 0) {
                i--;
                j++;
                a--;
            }
            System.out.println(j+ "/" + i);
        }
	}
}
