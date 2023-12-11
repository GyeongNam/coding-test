import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = new BigDecimal(sc.nextInt());
        BigDecimal b = new BigDecimal(sc.nextInt());

        System.out.println(a.divide(b, 9, RoundingMode.HALF_EVEN));
	}
}
