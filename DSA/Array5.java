public class Array5 {
    public static void main(String args[]) {
        int[] array = { 3, 5, 7, 8, -1, 4, 10, 12 };

        int min = array[0];
        int max = array[0];

        // Checking all elements in array
        for (int i = 1; i < array.length; i++) {
            // Min element
            if (array[i] < min) {
                min = array[i];
            }
            // Max element
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("Maximum element=" + max);
        System.out.println("Minimum element=" + min);

    }

}
