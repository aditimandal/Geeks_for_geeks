
// package Arrays;
//Rearrange an array such that arr[i] = i
import java.util.*;

public class m1 {
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

    // Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
    // Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

    public static int[] solution(int arr[], int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;

                }

            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                arr[i] = -1;
            }
        }
        return arr;

    }

}
