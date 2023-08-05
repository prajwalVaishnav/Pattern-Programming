public class New5 {
    public static void main(String[] args) {
        int n = 4;

        // Upper half of the pattern
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Lower half of the pattern
        count = 7; // Starting value for the lower half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
