import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a == b && b == c && a == 60){
            System.out.println("Equilateral");
        } else if (a+b+c == 180 && (a==b || a==c || b==c)){
            System.out.println("Isosceles");
        } else if (a+b+c == 180) {
            System.out.println("Scalene");
        } else if (a+b+c != 180) {
            System.out.println("Error");
        }
	}
}
