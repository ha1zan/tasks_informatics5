import java.util.Scanner;

public class task2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        boolean first = true;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x % 2 == 0) {
                if (!first) {
                    sb.append(" ");
                }
                sb.append(x);
                first = false;
            }
        }

        System.out.println(sb.toString());
    }
}