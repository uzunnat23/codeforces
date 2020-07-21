import java.util.Scanner;

public class NextRoundArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int r = 0;
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] == 0) break;
            if (i > k && a[i] < a[k]) break;
            r++;
        }
        System.out.println(r);
    }
}
