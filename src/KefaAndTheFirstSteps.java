import java.util.Scanner;

public class KefaAndTheFirstSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        int l = 0;
        scanner.nextLine();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; i++) {

            if (a[i] >= a[i - 1]) {
                k++;
            }

            if (a[i] < a[i - 1] || i == n - 1) {
                if (k > l) l = k + 1;
                k = 0;
            }
        }
        System.out.println(l);
    }
}
