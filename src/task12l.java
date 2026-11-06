import java.util.Scanner;

public class task12l {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        int petya = scanner.nextInt();
        int position = n + 1;
        for (int i = 0; i < n; i++) {
            if (heights[i] < petya) {
                position = i + 1;
                break;
            }
        }

        System.out.println(position);
    }
}
