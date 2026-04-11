package Data_Structure.Array;

public class LinearSearch {
    public static int search(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 8;
        int result = search(num, key);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
