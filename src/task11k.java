import java.util.Scanner;

public class task11k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println(0);
            return;
        }
        int prev = scanner.nextInt();
        int distinctCount = 1;

        for (int i = 1; i < n; i++) {
            int curr = scanner.nextInt();
            if (curr != prev) {
                distinctCount++;
                prev = curr;
            }
        }
        System.out.println(distinctCount);
    }
}
