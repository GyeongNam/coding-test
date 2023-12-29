import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long size = Long.parseLong(br.readLine());

        for(int i=0;i<size;i++){
           long num = Long.parseLong(br.readLine());
           while (true){
               if(isPrime(num)){
                   if(num<2){
                       System.out.println(2);
                   }else{
                       System.out.println(num);
                   }
                   break;
               }else{
                   num++;
               }
           }
        }
	}
    static boolean isPrime(long n) {
        for (long i = 2; i<=(long)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
