//Camel case of a given sentence

// Input  : I got intern at geeksforgeeks
// Output : IGotInternAtGeeksforgeeks
import java.util.*;

public class e7 {
    public static void main(String args[]) {
        String str = "I get intern at geeksforgeeks";
        System.out.println(convert(str));
    }

    public static String convert(String str) {
        int n = str.length();
        int count_spc = 0;
        int c = 0;
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                count_spc++;
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);

            } else {
                ch[c] = ch[i];
                c++;

            }
        }
        return String.valueOf(ch, 0, n - count_spc);

    }
}
