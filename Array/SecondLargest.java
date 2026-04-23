package Data_Structure.Array;

public class SecondLargest {
    public static void secondLarg(int num[]) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                second = largest;
                largest = num[i];
            } else if (num[i] > second && num[i] != largest) {
                second = num[i];
            }
        }
        System.out.println("Second largest: " + second);

    }

    public static void main(String args[]) {
        int num[] = { 10, 50, 85, 81, 77, 99 };
        secondLarg(num);
    }
}
