
//Queries for characters in a repeated string
import java.util.*;

public class m2 {
    static public void main(String[] args) {
        String X = "geeksforgeeks";

        query(X, 0, 8);
        query(X, 8, 13);
        query(X, 6, 15);

    }

    public static void query(String x, int a, int b) {
        int n = x.length();
        a = a % n;
        b = b % n;

        if (x.charAt(a) == x.charAt(b)) {
            System.out.println("yes");
        } else {
            System.out.println("no");

        }

    }
}
