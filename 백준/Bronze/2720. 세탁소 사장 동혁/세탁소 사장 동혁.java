import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int pay = sc.nextInt();
            int Quarter = 0;
            int Dime = 0;
            int Nickel = 0;
            int Penny = 0;

            Quarter = pay/25;
            pay = pay%25;
            Dime = pay/10;
            pay = pay%10;
            Nickel = pay/5;
            pay = pay%5;
            Penny = pay/1;
            System.out.println(Quarter);
            System.out.println(Dime);
            System.out.println(Nickel);
            System.out.println(Penny);
        }
	}
}
