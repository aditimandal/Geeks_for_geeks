
// package Arrays;
//Rearrange an array in maximum minimum form using Two Pointer Technique
import java.util.*;

public class e5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int res[] = max_min(arr, n);
        for (int vl : res) {
            System.out.print(vl + " ");
        }

        // System.out.println("Array after pushing zeros to the back: ");
        // for (int i = 0; i < n; i++)
        // System.out.print(arr[i] + " ");
    }

    // Input: arr[] = {1, 2, 3, 4, 5, 6, 7}
    // Output: arr[] = {7, 1, 6, 2, 5, 3, 4}

    public static int[] max_min(int arr[], int n) {
        Arrays.sort(arr);
        int l = 0;
        int h = n - 1;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 0) { // even position
                ans[i] = arr[l];
                l++;

            } else {
                ans[i] = arr[h];
                h--;
            }
        }
        return ans;

    }
}
