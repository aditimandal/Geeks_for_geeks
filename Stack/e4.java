import java.util.Stack;

//Postfix to Prefix Conversion

// postfix-->infix-->prefix

public class e4 {

    public static void main(String[] args) {
        String exp = "AB+CD-*";

        postfix_to_infix(exp);
    }

    public static void postfix_to_infix(String exp) {
        Stack<Character> ops = new Stack<>();
        Stack<String> infix = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
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
        infix_to_prefix(infix.pop());
    }

    public static void process(Stack<Character> ops, Stack<String> infix) {
        char op = ops.pop();
        String v2 = infix.pop();
        String v1 = infix.pop();
        String infixv = '(' + v1 + op + v2 + ')';
        infix.push(infixv);

    }

    public static void infix_to_prefix(String exp) {

        Stack<Character> ops1 = new Stack<>();
        Stack<String> prefix = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                ops1.push(ch);

            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                prefix.push(ch + "");

            } else if (ch == ')') {
                while (ops1.peek() != '(') {
                    process1(ops1, prefix);
                }
                ops1.pop();

            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                while (ops1.size() > 0 && ops1.peek() != '(' && precedence(ch) <= precedence(ops1.peek())) {
                    process1(ops1, prefix);
                }
                ops1.push(ch);

            }
        }
        while (ops1.size() > 0) {
            process1(ops1, prefix);
        }
        System.out.println(prefix.pop());
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

    public static void process1(Stack<Character> ops, Stack<String> prefix) {
        char op = ops.pop();
        String v2 = prefix.pop();
        String v1 = prefix.pop();
        String prefiv = op + v1 + v2;
        prefix.push(prefiv);

    }

}
