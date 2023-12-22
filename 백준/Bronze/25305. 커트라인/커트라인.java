import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        int size = sc.nextInt();
        int num = sc.nextInt();
        for(int i = 0; i<size; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(num-1));
	}
}
