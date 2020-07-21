import java.util.Scanner;

public class NextRoundSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int p;
        int pk = 0;
        int r = 0;
        for (int i = 1; i <= n; i++) {
            p = scanner.nextInt();
            if (p == 0) break;
            if (i == k) pk = p;
            else if (i > k && p < pk) break;
            r++;
        }
        System.out.println(r);
    }
}
