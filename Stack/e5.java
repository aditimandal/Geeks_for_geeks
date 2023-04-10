//Postfix to Infix

import java.util.*;
import java.io.*;

public class e5 {
    public static void main(String[] args) {
        String exp = "abc++";

        Stack<String> infix = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                ops.push(ch);

            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                infix.push(ch + " ");

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

    public static void process(Stack<Character> ops, Stack<String> infix) {
        char op = ops.pop();
        String v2 = infix.pop();
        String v1 = infix.pop();
        String infixv = '(' + v1 + op + v2 + ')';
        infix.push(infixv);

    }

}
