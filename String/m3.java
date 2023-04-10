//URLify a given string (Replace spaces with %20)

import java.util.*;

public class m3 {
    public static void replaceSpaces(String input) {
        String rep = "%20";
        String str2 = "";

        char ch[] = input.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                str2 += ch[i];

            } else {
                str2 += rep;

            }

        }
        System.out.println(str2);
    }

    public static void main(String[] args) {
        System.out.println("GFG!");
        String input = "Mr John Smith";
        replaceSpaces(input);
    }
}
