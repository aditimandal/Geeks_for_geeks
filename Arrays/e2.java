// package Arrays;

//Find Second largest element in an array
// Here,we use set for avoiding duplicates and we just return the second last element as we know set store in sorted order.
import java.util.*;

public class e2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> Arr = new ArrayList<>();
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            Arr.add(scn.nextInt());
        }

        find_Sec_Largest(Arr);
    }

    public static void find_Sec_Largest(ArrayList<Integer> Arr) {
        Set<Integer> s = new TreeSet<>(Arr);
        Arr.clear();
        for (int val : s) {
            Arr.add(val);
        }
        int k = Arr.size();

        System.out.print("The Second Largest Element in ArrayList is: ");
        System.out.println(Arr.get(k - 2));

    }
}
