import java.util.Scanner;

public class CharArrayCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] customChars = getChars(text);
        char[] builtinChars = text.toCharArray();

        boolean isEqual = compareCharArrays(customChars, builtinChars);

        System.out.print("Custom char array: ");
        for (char c : customChars) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in char array: ");
        for (char c : builtinChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both arrays equal: " + isEqual);

    }

    public static char[] getChars(String s) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
