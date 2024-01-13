import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb; // = new StringBuilder();
        StringTokenizer st; //  = new StringTokenizer(br.readLine());
        while (true){
            String str = br.readLine();
            if (str.equals("0")){
                break;
            }
            StringBuffer sbs = new StringBuffer(str);
            String reverse = sbs.reverse().toString();
            if(str.toString().equals(reverse)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}