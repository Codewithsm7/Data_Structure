package Data_Structure.Array;

public class KadanesAlgorithm {
    public static void kadanesSum(int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Sub Array Sum: " + ms);
    }

    public static void main(String args[]) {
        int num[] = { -2, -1, 4, -2, 5, -3 };
        kadanesSum(num);
    }
}
