
//Program to find Smallest and Largest Word in a String
import java.util.*;

public class e5 {

    public static void main(String[] args) {
        String a = "GeeksforGeeks A Computer Science portal for Geeks";

        minMaxLengthWords(a);
        System.out.print("Minimum length word: " + minWord + "\nMaximum length word: " + maxWord);
    }

    static String minWord = "", maxWord = "";

    public static void minMaxLengthWords(String a) {
        a = a.trim();
        int s = 0;
        int e = 0;
        int len = a.length();

        int min_len = len, min_start_index = 0, max_len = 0, max_start_index = 0;

        while (e <= len) {
            if (e < len && a.charAt(e) != ' ') {
                e++;
            } else {
                int curr_len = e - s;
                if (curr_len > max_len) {
                    max_len = curr_len;
                    max_start_index = s;
                }
                if (curr_len < min_len) {
                    min_len = curr_len;
                    min_start_index = s;
                }

                e++;
                s = e;
            }

        }
        minWord = a.substring(min_start_index, min_start_index + min_len);
        maxWord = a.substring(max_start_index, max_start_index + max_len);

    }

}
