package Data_Structure.Array;

public class PrintArray {
    public static void printArray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        printArray(num);
    }
}
