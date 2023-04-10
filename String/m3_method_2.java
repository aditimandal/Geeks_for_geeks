import java.util.*;

public class m3_method_2 {
    public static void main(String[] args) {
        System.out.println("GFG!");
        String input = "Mr John Smith";
        replaceSpaces(input);
    }

    public static void replaceSpaces(String input) {
        input = input.trim();
        String str = input.replaceAll(" ", "%20");
        System.out.println(str);
    }

}
