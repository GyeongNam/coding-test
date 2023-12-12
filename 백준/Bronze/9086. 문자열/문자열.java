import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<size; i++){
            String str = sc.nextLine();
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }
	}
}
