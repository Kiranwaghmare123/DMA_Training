public class Array7 {
    // static function:=> No object is required to call a function.
    static int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;

        }
        return -1;

    }

    public static void main(String args[]) {
        int[] arr = { 2, 31, 47, 15, 6, 9, 34 };
        int x = 39;// search key element

        int result = search(arr, x);
        if (result == -1)
            System.out.println("Not found!");
        else
            System.out.println("Found!");

    }

}
