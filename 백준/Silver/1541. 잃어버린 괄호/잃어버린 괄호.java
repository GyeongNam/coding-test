import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();
        
        StringTokenizer tokenizer = new StringTokenizer(expression, "-");
        
        int result = 0;
        
        StringTokenizer firstPart = new StringTokenizer(tokenizer.nextToken(), "+");
        while (firstPart.hasMoreTokens()) {
            result += Integer.parseInt(firstPart.nextToken());
        }
        
        while (tokenizer.hasMoreTokens()) {
            StringTokenizer subPart = new StringTokenizer(tokenizer.nextToken(), "+");
            int subResult = 0;
            while (subPart.hasMoreTokens()) {
                subResult += Integer.parseInt(subPart.nextToken());
            }
            result -= subResult;
        }
        
        System.out.println(result);
    }
}
