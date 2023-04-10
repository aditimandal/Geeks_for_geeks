// Prefix to Postfix Conversion

import java.util.*;
import java.io.*;

public class e3 {

    public static void main(String[] args) {
        String exp = "*-A/BC-/AKL";

        // Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        prefix_infix(exp);

    }

    public static void prefix_infix(String exp) {
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
        // System.out.println(infix.pop());
        infix_to_postfix(infix.pop());

    }

    public static void process(Stack<Character> ops, Stack<String> infix) {
        char op = ops.pop();
        String v2 = infix.pop();
        String v1 = infix.pop();

        String infixv = '(' + v2 + op + v1 + ')';
        infix.push(infixv);
    }

    public static void infix_to_postfix(String exp) {
        Stack<String> postfix = new Stack<>();
        Stack<Character> ops1 = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                ops1.push(ch);

            } else if ((ch >= 0 && ch <= 9) || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                postfix.push(ch + "");

            } else if (ch == ')') {
                while (ops1.peek() != '(') {
                    process1(ops1, postfix);
                }
                ops1.pop();

            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                while (ops1.size() > 0 && ops1.peek() != '(' && precedence(ch) <= precedence(ops1.peek())) {
                    process1(ops1, postfix);
                }
                ops1.push(ch);

            }
        }
        while (ops1.size() > 0) {
            process1(ops1, postfix);
        }
        System.out.println(postfix.pop());

    }

    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '^') {
            return 3;
        } else {
            return 0;
        }
    }

    public static void process1(Stack<Character> ops1, Stack<String> postfix) {
        char op = ops1.pop();
        String v2 = postfix.pop();
        String v1 = postfix.pop();
        String postv = v1 + v2 + op;
        postfix.push(postv);

    }

}
