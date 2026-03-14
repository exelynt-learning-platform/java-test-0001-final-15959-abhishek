public class Task1 {
    public static void main(String[] args) {

        int i, j, n = 5, k = 0;

        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {

                if (j == n - k || j == n + k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();

            k = (i < 5) ? k + 1 : k - 1;
        }
    }
}
