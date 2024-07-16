class Test {
    public static void main(String args[]) {
        int[] array = { 3, 5, 7, 2, 8, -1, 4 };

        // Sorting the array in ascending order
        java.util.Arrays.sort(array);

        // Printing the sorted array
        for (int element : array) {
            System.out.println("Element: " + element);
        }

    }
}