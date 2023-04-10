// package Arrays;

//Search an element in a sorted and rotated Array
import java.util.*;

public class m4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        int res = solution(arr, k);
        System.out.println("Element found at " + res);
    }

    public static int solution(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                return i;
            }
        }
        return -1;

    }
}
