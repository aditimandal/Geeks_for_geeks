
// Find the smallest missing number
import java.util.*;

public class m7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int start = 0;
        int end = n - 1;

        int res = solution(arr, start, end);
        System.out.println("missing ele is: " + res);
    }

    public static int solution(int arr[], int start, int end) {

        if (start > end) {
            return end + 1;
        }
        if (start != arr[start]) {
            return start;
        }

        int mid = (start + end) / 2;
        if (arr[mid] == mid) {
            return solution(arr, mid + 1, end);
        }
        return solution(arr, start, mid);

    }

}
