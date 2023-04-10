
// Add n binary strings
import java.util.*;

public class e3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
        }
        String ans = addBinary(arr, n);
        System.out.println("the sum of n binary number is:" + ans);

    }

    static String addBinary(String arr[], int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res = add(res, arr[i]);
        }
        return res;

    }

    static String add(String a, String b) {
        String result = "";
        int sum = 0;

        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || sum == 1) {
            sum += ((i >= 0) ? a.charAt(i) - '0' : 0);
            sum += ((j >= 0) ? b.charAt(j) - '0' : 0);

            result = sum % 2 + result;

            sum = sum / 2;

            i--;
            j--;
        }
        return result;
    }
}