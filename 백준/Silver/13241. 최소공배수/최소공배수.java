import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        System.out.println(a*b/gdc(a,b));
	}
    static long gdc(long a, long b){
        if(a<b){
            long temp = a;
            a = b;
            b = temp;
        }
        while (b!=0){
            long temp2 = a%b;
            a = b;
            b = temp2;
        }
        return a;
    }
}
