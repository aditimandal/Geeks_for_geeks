//Convert Infix expression to Postfix expression

import java.io.*;
import java.util.*;

public class e1 {

    public static void main(String[] args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        Stack<String> postfix = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                ops.push(ch);

            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                postfix.push(ch + "");

            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    process(ops, postfix);
                }
                ops.pop();

            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                while (ops.size() > 0 && ops.peek() != '(' && precedence(ch) <= precedence(ops.peek())) {
                    process(ops, postfix);
                }
                ops.push(ch);

            }
        }

        while (ops.size() > 0) {
            process(ops, postfix);
        }

        System.out.println(postfix.pop());

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

    public static void process(Stack<Character> ops, Stack<String> postfix) {
        char op = ops.pop();
        String v2 = postfix.pop();
        String v1 = postfix.pop();
        String postv = v1 + v2 + op;
        postfix.push(postv);

    }
}