import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int res = 0;
        int p, v, t;
        for (int i = 0; i < n; i++) {
            p = scanner.nextInt();
            v = scanner.nextInt();
            t = scanner.nextInt();
            sum = p + v + t;
            if (sum > 1)
                res++;
        }
        System.out.println(res);
    }
}
