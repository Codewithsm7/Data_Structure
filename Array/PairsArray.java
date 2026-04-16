package Data_Structure.Array;

public class PairsArray {
    public static void twoPairs(int num[]) {
        int tp = 0;
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ")");
                tp++;
                sum += num[i] + num[j];
            }
            System.out.println();
            System.out.println("Sum of Pairs: " + sum);
            sum = 0;
        }
        System.out.println("Total Pairs: " + tp);

    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5 };

        twoPairs(num);
    }
}
