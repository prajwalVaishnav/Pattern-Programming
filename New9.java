public class New9 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int num = (i * (i - 1)) / 2 + 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (j < i) {
                    System.out.print("*");
                }
                num++;
            }
            System.out.println();
        }

        for (int i = n ; i >= 1; i--) {
            int num = (i * (i - 1)) / 2 + 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (j < i) {
                    System.out.print("*");
                }
                num++;
            }
            System.out.println();
        }
    }
}
