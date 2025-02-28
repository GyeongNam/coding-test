import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String bomb = scanner.nextLine();
        scanner.close();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if (stack.size() >= bomb.length()) {
                boolean match = true;
                for (int j = 0; j < bomb.length(); j++) {
                    if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    for (int j = 0; j < bomb.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("FRULA");
        } else {
            StringBuilder result = new StringBuilder();
            for (char c : stack) {
                result.append(c);
            }
            System.out.println(result.toString());
        }
    }
}