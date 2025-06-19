import java.util.Scanner;

public class ManualTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        int[] bounds = getTrimBounds(input);
        String customTrimmed = manualSubstring(input, bounds[0], bounds[1]);
        String builtinTrimmed = input.trim();
        boolean isSame = compareStrings(customTrimmed, builtinTrimmed);

        System.out.println("Custom Trimmed: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed: \"" + builtinTrimmed + "\"");
        System.out.println("Both are equal: " + isSame);
    }

    public static int[] getTrimBounds(String s) {
        int start = 0, end = s.length() - 1;

        while (start < s.length() && s.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    public static String manualSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}
