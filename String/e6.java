
//Count number of equal pairs in a string
import java.util.*;

public class e6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        solution(s);
    }

    public static void solution(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (hm.containsKey(x)) {
                hm.put(x, hm.get(x) + 1);
            } else {
                hm.put(x, 1);
            }
        }
        int sum = 0;
        for (char key : hm.keySet()) {
            sum += Math.pow(hm.get(key), 2);
        }
        System.out.println("total number:" + sum);
    }
}
