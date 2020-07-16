import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        int r = 0;

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();

        for (int i = 0; i <= w; i++) r += k * i;

        System.out.println(r > n ? r - n : 0);
    }
}
