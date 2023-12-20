import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        boolean isPrime = false;
        ArrayList<Integer> list = new ArrayList();
        for (int i = min; i<=max; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(list.stream().mapToInt(a->a).sum());
            System.out.println(list.stream().mapToInt(a->a).min().getAsInt());
        }
	}
    public static boolean isPrime(int num) {
        boolean result = true;
        if(num == 1){
            result = false;
        }
        for(int i = 2; i < num; i++) {
            if( num%i == 0) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
