public class Array6 {
    public static void main(String args[]) {
        int[] array = { 3, 5, 7, 8, 111, 4, 10, 12 };
        int sum = 0;

        // Sum of array elements
        for (int x : array) {
            sum += x;
        }

        // Calculate average
        double average = (double) sum / array.length;

        System.out.println("Sum=" + sum);
        System.out.println("Average=" + average);
    }

}
