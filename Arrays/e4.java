
// package Arrays;
//Rearrange array such that even positioned are greater than odd
import java.util.*;

public class e4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int res[] = even_grea_odd(arr, n);
        for (int vl : res) {
            System.out.print(vl + " ");
        }

        // System.out.println("Array after pushing zeros to the back: ");
        // for (int i = 0; i < n; i++)
        // System.out.print(arr[i] + " ");
    }

    public static int[] even_grea_odd(int arr[], int n) {
        Arrays.sort(arr);
        int ans[] = new int[n];
        int l = 0;
        int h = n - 1;

        for (int j = 0; j < n; j++) {
            if ((j + 1) % 2 == 0) { // even positions
                ans[j] = arr[h];
                h--;
            } else { // odd positions
                ans[j] = arr[l];
                l++;
            }
        }
        return ans;
    }
}
