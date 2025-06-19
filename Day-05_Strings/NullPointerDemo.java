public class NullPointerDemo {
    public static void main(String[] args) {
        generateNullPointerException();
        handleNullPointerException();
    }

    public static void generateNullPointerException() {
        System.out.println("Generating NullPointerException:");
        String text = null;
        int len = text.length(); // causes exception
        System.out.println("Length: " + len);
    }

    public static void handleNullPointerException() {
        System.out.println("Handling NullPointerException:");
        try {
            String text = null;
            int len = text.length(); // causes exception
            System.out.println("Length: " + len);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
