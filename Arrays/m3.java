// package Arrays;
//Reorder an array according to given indexes

// Input:  arr[]   = [10, 11, 12];
//             index[] = [1, 0, 2];
// Output: arr[]   = [11, 10, 12]
//            index[] = [0,  1,  2] 
import java.util.*;

// public class m3 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int arr[] = new int[n];
//         int index[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }

//         for (int i = 0; i < n; i++) {
//             index[i] = scn.nextInt();
//         }
//         int res[] = solution(arr, index);
//         for (int vl : res) {
//             System.out.print(vl + " ");
//         }
//     }

//     // Input: arr[] = [10, 11, 12];
//     // index[] = [1, 0, 2];
//     // Output: arr[] = [11, 10, 12]
//     // index[] = [0, 1, 2]
//     public static int[] solution(int arr[], int index[]) {
//         int temp[] = new int[arr.length];
//         for (int j = 0; j < arr.length; j++) {
//             temp[j] = arr[index[j]];
//         }

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = temp[i];
//             index[i] = i;
//         }
//         return arr;

//     }

// }

//Java to find positions of zeroes flipping which
// produces maximum number of consecutive 1's

import java.util.Arrays;

class m3 {
    static int arr[] = new int[] { 10, 11, 12 };
    static int index[] = new int[] { 1, 0, 2 };

    // Method to reorder elements of arr[] according
    // to index[]
    static void reorder() {
        int temp[] = new int[arr.length];

        // arr[i] should be present at index[i] index
        for (int i = 0; i < arr.length; i++)
            temp[index[i]] = arr[i];

        // Copy temp[] to arr[]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
            index[i] = i;
        }
    }

    // Driver method to test the above function
    public static void main(String[] args) {

        reorder();

        System.out.println("Reordered array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Modified Index array is:");
        System.out.println(Arrays.toString(index));

    }
}
