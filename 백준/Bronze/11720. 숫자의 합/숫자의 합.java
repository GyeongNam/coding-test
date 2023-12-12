import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            num += Integer.parseInt(str.charAt(i)+"");
        }
        System.out.println(num);
	}
}
