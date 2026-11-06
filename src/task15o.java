import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class task15o {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        int totalDestroyed = 0;
        while (true) {
            List<Integer> newArr = new ArrayList<>();
            int i = 0;
            int passDestroyed = 0;

            while (i < arr.size()) {
                int j = i;
                while (j < arr.size() && arr.get(j).equals(arr.get(i))) {
                    j++;
                }

                int length = j - i;
                if (length >= 3) {
                    passDestroyed += length;
                } else {
                    for (int k = i; k < j; k++) {
                        newArr.add(arr.get(k));
                    }
                }
                i = j;
            }
            if (passDestroyed == 0) {
                break;
            }

            totalDestroyed += passDestroyed;
            arr = newArr;
        }
        System.out.println(totalDestroyed);
    }
}
