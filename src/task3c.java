import java.util.Scanner;

public class task3c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}