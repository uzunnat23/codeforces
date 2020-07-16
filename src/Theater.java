import java.util.Scanner;

public class Theater {
    public static void main(String[] args) {
        long c, d;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();

        if (n % a == 0) {
            c = n / a;
        } else {
            c = n / a + 1;
        }

        if (m % a == 0) {
            d = m / a;
        } else {
            d = m / a + 1;
        }
        System.out.println(c * d);
    }
}
