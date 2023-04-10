
//K’th Non-repeating Character
import java.util.*;

public class m1 {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int k = 3;
        char res = kthNonRepeating(str, k);

        System.out.println("k'th non-repeating character is  " + res);
    }

    public static char kthNonRepeating(String str, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            if (hm.containsKey(x)) {
                hm.put(x, hm.get(x) + 1);
            } else {
                hm.put(x, 1);
            }
        }
        char ans = ' ';

        for (int i = 0; i < str.length(); i++) {

            if (hm.get(str.charAt(i)) == 1) {
                k--;
                if (k == 0) {
                    ans = str.charAt(i);
                }
            }

        }
        return ans;
    }
}
