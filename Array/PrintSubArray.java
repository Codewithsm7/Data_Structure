package Data_Structure.Array;

public class PrintSubArray {
    public static void subArray(int num[]) {
        int ts = 0;
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                    ts++;
                    sum += num[k];
                }
                System.out.println();
                // Agar ek ek sub array ka sum print karna hai to is line ko uncomment kar do
                // System.out.println("Sum of Sub Array: " + sum);
                // sum = 0;
            }

            System.out.println("Sum of Sub Array: " + sum);
            sum = 0;
            System.out.println();
        }
        System.out.println("Total Sub Array: " + ts);
    }

    public static void main(String agrs[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        subArray(num);
    }
}
