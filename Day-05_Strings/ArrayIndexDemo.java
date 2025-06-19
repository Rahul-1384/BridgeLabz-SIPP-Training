import java.util.Scanner;

public class ArrayIndexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        generateException(names);
        handleException(names);
    }

    public static void generateException(String[] arr) {
        System.out.println("Generating exception:");
        String name = arr[5];
        System.out.println(name);
    }

    public static void handleException(String[] arr) {
        System.out.println("Handling exception:");
        try {
            String name = arr[5];
            System.out.println(name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
