import java.util.Scanner;

public class StringIndexExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        generateException(input);
        handleException(input);
    }

    public static void generateException(String text) {
        System.out.println("Generating exception:");
        char ch = text.charAt(text.length()); // Causes exception
        System.out.println("Character: " + ch);
    }

    public static void handleException(String text) {
        System.out.println("Handling exception:");
        try {
            char ch = text.charAt(text.length()); // Causes exception
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
