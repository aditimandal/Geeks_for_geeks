//Difference Array | Range update query in O(1)
import java.util.*;
public class m8 {
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

        // int res = solution(arr,D);

        int D[] = new int[n + 1];
        initializeDiffArray(arr, D);
        update(D, 0, 1, 10);
        printArray(arr, D);
        // System.out.println("missing ele is: " + res);
    }

    static void initializeDiffArray(int arr[], int D[]){
        int n=arr.length;
        D[0] = arr[0];
        D[n] = 0;
        for(int i=1;i<n;i++){
            D[i] = arr[i] - arr[i-1];

        }

    }
    static void update(int D[], int l, int r, int x){
        D[l]+=x;
        D[r+1]-=x;
    }

    static int printArray(int arr[], int D[]){
        for (int i = 0; i < arr.length; i++) {
             
            if (i == 0)
                arr[i] = D[i];
 
            // Note that A[0] or D[0] decides
            // values of rest of the elements.
            else
                arr[i] = D[i] + arr[i - 1];
 
            System.out.print(arr[i] + " ");
        }
         
        System.out.println();
         
        return 0;
    }
}
