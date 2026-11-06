import java.util.Scanner;

public class task10j {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        if (n <= 0) return;
        int maxVal = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();
            if (current > maxVal) {
                maxVal = current;
            }
        }
        System.out.println(maxVal);
    }
}
