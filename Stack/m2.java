import java.util.Stack;

//The Stock Span Problem
public class m2 {
    public static void main(String[] args) {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];

        // Fill the span values in array S[]
        calculateSpan(price, n, S);

        // print the calculated span values
        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i] + " ");
        }
    }

    public static int[] calculateSpan(int[] price, int n, int[] S) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        S[0] = 1;

        for (int i = 1; i < price.length; i++) {
            while (st.size() > 0 && price[i] > price[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                S[i] = i + 1;
            } else {
                S[i] = i - st.peek();
            }
            st.push(i);

        }
        return S;

    }
}