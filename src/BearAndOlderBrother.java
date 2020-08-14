import java.util.Scanner;

public class BearAndOlderBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bear = scanner.nextInt();
        int brother = scanner.nextInt();
        int year = 0;

        while (bear <= brother) {
            bear *= 3;
            brother *= 2;
            year++;
        }
        System.out.println(year);
    }
}
