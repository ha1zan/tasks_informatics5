import java.util.Scanner;

public class task4d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(0);
            return;
        }

        int prev = scanner.nextInt();
        int count = 0;

        for (int i = 1; i < n; i++) {
            int curr = scanner.nextInt();
            if (curr > prev) {
                count++;
            }
            prev = curr;
        }

        System.out.println(count);
    }
}