import java.util.Scanner;

public class task5e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("NO");
            return;
        }

        int prev = scanner.nextInt();
        boolean found = false;

        for (int i = 1; i < n; i++) {
            int curr = scanner.nextInt();

            if ((prev > 0 && curr > 0) || (prev < 0 && curr < 0)) {
                found = true;
                break;
            }
            prev = curr;
        }

        System.out.println(found ? "YES" : "NO");
    }
}