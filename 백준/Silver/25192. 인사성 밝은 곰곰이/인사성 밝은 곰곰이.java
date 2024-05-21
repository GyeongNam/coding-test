import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        Set<String> set = new HashSet<>();
        for(int i = 1; i <= N; i++){
            String str = br.readLine();
            if(str.equals("ENTER")){
                sum += set.size();
                set.clear();
            }else{
                set.add(str);
            }
        }
        sum += set.size();
        System.out.println(sum);
    }
}