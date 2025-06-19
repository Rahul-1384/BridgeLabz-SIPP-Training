public class Demo {

    static int staticVar = 100;

    int instanceVar = 200;

    static void staticMethod() {
        System.out.println("Inside static method");

        System.out.println("Static Variable: " + staticVar);

        Demo obj = new Demo();
        System.out.println("Non-Static variable: " + obj.instanceVar);
    }

    void instanceMethod() {
        System.out.println("Inside non-static method");
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Instance Variable: " + instanceVar);
    }

    public static void main(String[] args) {
        staticMethod();

        Demo obj = new Demo();
        obj.instanceMethod();
    }
}
