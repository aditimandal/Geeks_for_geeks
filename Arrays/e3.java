// package Arrays;

//Move all zeroes to end of array
import java.util.*;

public class e3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int res[] = zeroes_at_end(arr);
        for (int vl : res) {
            System.out.print(vl + " ");
        }

        // System.out.println("Array after pushing zeros to the back: ");
        // for (int i = 0; i < n; i++)
        // System.out.print(arr[i] + " ");
    }
    //[3,0,54,0,0,99, 0]
    public static int[] zeroes_at_end(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }

        }
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
        return arr;

    }

}
