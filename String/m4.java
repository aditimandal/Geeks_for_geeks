
//Count of total anagram substrings
import java.util.*;

public class m4 {

    public static void main(String[] args) {
        int ans = subString("aabaabaa", "abba");
        System.out.println(ans);
    }

    public static int subString(String s, String p) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        int j = 0;
        int k = p.length();
        int count = hm.size();
        int ans = 0;

        while (j < s.length()) {
            char x = s.charAt(j);
            if (hm.containsKey(x)) {
                hm.put(x, hm.get(x) - 1);
                if (hm.get(x) == 0) {
                    count--;
                }

            }

            if (j - i + 1 < k) {
                j++;
            }

            else if (j - i + 1 == k) {
                if (count == 0) {
                    ans++;
                }
                if (hm.containsKey(s.charAt(i))) {
                    hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
                    if (hm.get(s.charAt(i)) == 1) {
                        count++;
                    }
                }
                i++;
                j++;

            }

        }
        return ans;
    }

}
