
//Count strings with consecutive 1’s
import java.util.*;

public class e1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int oczeroes = 1;
        int ocones = 1;

        for (int i = 2; i <= n; i++) {
            int ncones = oczeroes;
            int nczeroes = ocones + oczeroes;

            ocones = ncones;
            oczeroes = nczeroes;
        }
        System.out.println(oczeroes + ocones);
    }
}