import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Math.abs(x - w));
        list.add(Math.abs(y - h));
        list.add(x);
        list.add(y);
        System.out.println(list.stream().mapToInt(a->a).min().getAsInt());
	}
}
