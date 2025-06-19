import java.util.Scanner;

public class WordLength2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordLengthArray = getWordLengthArray(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            int length = Integer.parseInt(wordLengthArray[i][1]);
            System.out.println(wordLengthArray[i][0] + "\t" + length);
        }

        sc.close();
    }

    public static String[] splitWords(String text) {
        String[] words = new String[100];
        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    words[index++] = word;
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            words[index++] = word;
        }

        String[] finalWords = new String[index];
        for (int i = 0; i < index; i++) {
            finalWords[i] = words[i];
        }
        return finalWords;
    }

    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
}
