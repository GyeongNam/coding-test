import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = sc.nextInt();
        int result = 0;
        ArrayList<Integer> list = new ArrayList();
        for (int i = 1; i<=num; i++){
            if(num%i==0){
                list.add(i);
            }
        }
        if (!list.isEmpty() && count <= list.size() ) {
            result = list.get(count-1);
        }
        System.out.println(result);
	}
}
