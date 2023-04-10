
// package Arrays;
//Rearrange positive and negative numbers in O(n) time and O(1) extra space
import java.util.*;

public class m2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int res[] = solution(arr, n);
        for (int vl : res) {
            System.out.print(vl + " ");
        }
    }

    // [-1, 2, -3, 4, 5, 6, -7, 8, 9] --> [-1, -3, -7, 2, 4, 5, 6, 8, 9]--> [9, -7,
    // 8, -3, 5, -1, 2, 4, 6]
    public static int[] solution(int arr[], int n) {
        int i = -1;

        int temp;

        // partition of negative & positive elements
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

        }

        int pos = i + 1;
        int neg = 0;
        while (pos < n && neg < pos && arr[neg] < 0) {
            temp = arr[pos];
            arr[pos] = arr[neg];
            arr[neg] = temp;
            pos++;
            neg += 2;
        }
        return arr;

    }
}
