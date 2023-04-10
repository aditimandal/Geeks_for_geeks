
//Prefix to Infix Conversion
import java.io.*;
import java.util.*;

public class e2 {

    public static void main(String[] args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = "*-A/BC-/AKL";
        Stack<String> infix = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                ops.push(ch);

            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                infix.push(ch + "");

            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    process(ops, infix);
                }
                ops.pop();

            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                while (ops.size() > 0 && ops.peek() != '(') {
                    process(ops, infix);
                }
                ops.push(ch);
                process(ops, infix);

            }
        }

        while (ops.size() > 0) {
            process(ops, infix);
        }

        System.out.println(infix.pop());

    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else if (op == '^') {
            return 3;

        } else {
            return 0;
        }

    }

    public static void process(Stack<Character> ops, Stack<String> infix) {
        char op = ops.pop();
        String v2 = infix.pop();
        String v1 = infix.pop();
        String infixv = '(' + v2 + op + v1 + ')';
        infix.push(infixv);
        

    }

}
