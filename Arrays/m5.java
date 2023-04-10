
// package Arrays;
//Find the Rotation Count in Rotated Sorted array


//logic-If we take a closer look at examples, we can notice that the number of rotations is equal to the index of the minimum element.
// A simple linear solution is to find the minimum element and returns its index.
import java.util.*;

public class m5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // int k = scn.nextInt();

        int res = solution(arr, n);
        System.out.println("no. of rotations " + res);
    }

    // Input: arr[] = {15, 18, 2, 3, 6, 12}
    // Output: 2
    public static int solution(int arr[], int n) {
        int min = Integer.MAX_VALUE;
        int min_idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                min_idx = i;
            }
        }
        return min_idx;

    }
}
