public class Example11 {
    public static void main(String[] args) {
        int n = 3; // Number of rows for the pattern
        int num = 1;
        int spaceCount = n - 1;
        int starCount = 1;

        for (int i = 1; i <= n; i++) {
            // Spaces before the numbers or stars
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print("  ");
            }

            // Numbers or stars in ascending order
            for (int j = 1; j <= starCount; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(num);
                    if (num < 9) {
                        System.out.print(" ");
                    }
                    num++;
                }
            }

            // New line after each row
            System.out.println();

            // Update spaceCount and starCount for the next row
            spaceCount--;
            starCount += 2;
        }
    }
}
