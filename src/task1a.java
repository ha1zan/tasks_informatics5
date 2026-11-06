import java.util.Scanner;

public class task1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i += 2) {
            sb.append(a[i]).append(i + 2 < n ? " " : "");
        }

        System.out.println(sb.toString());
    }
}