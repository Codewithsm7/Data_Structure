package Data_Structure.Array;

public class LargestNum {
    public static int largestNumber(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int result = largestNumber(num);
        System.out.println("The largest number in the array is: " + result);
    }
}
