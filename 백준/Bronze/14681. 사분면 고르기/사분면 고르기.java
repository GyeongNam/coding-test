import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int result = a>=0 && b>=0 ?
                1
                :
                a<0 && b>=0 ?
                        2
                        :
                        a<0 && b<0 ?
                                3
                                :
                                a>=0 && b<0 ?
                                        4
                                        :
                                        0 ;
        System.out.println(result);
	}
}
