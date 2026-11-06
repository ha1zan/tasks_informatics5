import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
public class task14n {
    private static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null || line.trim().isEmpty()) return;
        int n = Integer.parseInt(line.trim());
        int[] a = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tokenizer.nextToken());
        }
        long k = Long.parseLong(reader.readLine().trim());
        int shift = (int) (k % n);
        if (shift < 0) {
            shift += n;
        }
        if (shift > 0) {
            reverse(a, 0, n - shift - 1);
            reverse(a, n - shift, n - 1);
            reverse(a, 0, n - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i]).append(i + 1 < n ? " " : "");
        }
        System.out.println(sb.toString());
    }
}
