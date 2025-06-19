import java.util.Scanner;

public class CustomSplitCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] customSplit = customSplit(input);
        String[] builtinSplit = input.split(" ");

        boolean equal = compareStringArrays(customSplit, builtinSplit);

        System.out.println("Custom Split:");
        for (String word : customSplit) System.out.println(word);

        System.out.println("\nBuilt-in Split:");
        for (String word : builtinSplit) System.out.println(word);

        System.out.println("\nAre both splits equal: " + equal);
    }

    public static int getLength(String s) {
        int len = 0;
        try {
            while (true) {
                s.charAt(len);
                len++;
            }
        } catch (Exception e) {
            return len;
        }
    }

    public static String[] customSplit(String text) {
        int len = getLength(text);
        int wordCount = 0;
        int[] spaceIndexes = new int[len];
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[wordCount++] = i;
            }
        }

        String[] words = new String[wordCount + 1];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i];
            words[i] = "";
            for (int j = start; j < end; j++) {
                words[i] += text.charAt(j);
            }
            start = end + 1;
        }

        words[wordCount] = "";
        for (int j = start; j < len; j++) {
            words[wordCount] += text.charAt(j);
        }

        return words;
    }

    public static boolean compareStringArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
}
