import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int result = a%400==0 ? 1 : (a%100!=0 ? (a%4 == 0 ? 1 : 0) : 0) ;
        System.out.println(result);
	}
}
