package Data_Structure.Array;

public class PairsArray {
    public static void twoPairs(int num[]) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.println("[" + num[i] + "," + num[j] + "]");

            }
        }
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5 };

        twoPairs(num);
    }
}
