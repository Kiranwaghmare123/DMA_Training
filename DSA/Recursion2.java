public class Recursion2 {
    static int i = 0;

    // Finite recursion
    static void show() {
        if (i <= 5) {// base condition
            ++i;
            System.out.println("Hello everyone!");
            show();
        }
    }

    public static void main(String args[]) {
        show();
    }

}
