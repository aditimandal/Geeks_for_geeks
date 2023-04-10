import java.util.*;

public class m8_method_2 {
    static int A[] = { 10, 5, 20, 40 };
    static int n = A.length;

    static void update(int p, int q, int r) {
        for (int i = p; i <= q; i++) {
            A[i] += r;
        }
    }

    static void printArray() {
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        update(0, 1, 10);
        printArray();
        update(1, 3, 20);
        update(2, 2, 30);
        printArray();

    }

}
