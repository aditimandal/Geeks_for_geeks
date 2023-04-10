//Find the largest three distinct elements in an array

import java.util.*;

public class e1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        findmax3(arr);
    }

    public static void findmax3(int arr[]) {
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;

        if(arr.length<3){
            System.out.println("Invalid Input");
            return;
        }

        for (int j = 0; j < arr.length; j++) {
            int x = arr[j];

            if (x > first) {
                third = second;
                second = first;
                first = x;

            } else if (x > second && x != first) {
                third = second;
                second = x;
            } else if (x > third && x != second) {
                third = x;
            }
        }
        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }
}