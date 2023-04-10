
//K-th Largest Sum Contiguous Subarray  using min-heap
import java.util.*;

public class m6_method_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = scn.nextInt();

        int res = solution(arr, n, k);
        System.out.println("no. of rotations " + res);
    }

    public static int solution(int arr[], int n, int k) {
        int sumarr[] = new int[n + 1];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += arr[j];
                sumarr[i] = sum;
            }

        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(sumarr[i]);
        }
        for (int i = k; i < sumarr.length; i++) {
            if (sumarr[i] > pq.peek()) {
                pq.remove();
                pq.add(sumarr[i]);
            }
        }
        return pq.peek();
    }
}
