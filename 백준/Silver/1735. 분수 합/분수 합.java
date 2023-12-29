import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        long numerator = (a*d)+(b*c);
        long denominator = (b*d);
        long mod = gcd(numerator, denominator);
        numerator /= mod;
        denominator /= mod;
        System.out.println( numerator + " " + denominator);
	}
    static long gcd(long a, long b){
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
