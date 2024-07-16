public class Array2 {
    public static void main(String args[]) {
        // Declaration of array
        int arr[] = new int[5];
        // Initialization of array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // Accessing an element of an array
        System.out.println("Element=" + arr[2]);

        // Method 1 :Traversing an array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        // Method 2 :For-each loop
        for (int x : arr) {
            System.out.print(x + " ");

        }
    }
}
