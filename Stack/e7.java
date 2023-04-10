import java.util.Stack;

//Check for Balanced Brackets in an expression (well-formedness) using Stack
import java.util.*;

public class e7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(balance(str));
    }

    public static boolean balance(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.size() == 0 || st.peek() != '(')
                    return false;
                st.pop();

            } else if (ch == '}') {
                if (st.size() == 0 || st.peek() != '{')
                    return false;
                st.pop();

            } else if (ch == ']') {
                if (st.size() == 0 || st.peek() != '[')
                    return false;
                st.pop();

            }
        }
        return st.size() == 0;

    }

}
