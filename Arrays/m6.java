
// package Arrays;
//K-th Largest Sum Contiguous Subarray
import java.util.*;

public class m6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        int res = solution(arr, n, k);
        System.out.println("no. of rotations " + res);
    }

    public static int solution(int arr[], int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                result.add(sum);

            }
        }
        Collections.sort(result, Collections.reverseOrder());
        return result.get(k - 1);

    }
}




