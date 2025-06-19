import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        generateIllegalArgumentException(input);
        handleIllegalArgumentException(input);

        sc.close();
    }

    public static void generateIllegalArgumentException(String text) {
        System.out.println("Generating IllegalArgumentException:");
        String sub = text.substring(5, 2); // causes exception
        System.out.println("Substring: " + sub);
    }

    public static void handleIllegalArgumentException(String text) {
        System.out.println("Handling IllegalArgumentException:");
        try {
            String sub = text.substring(5, 2); // causes exception
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
