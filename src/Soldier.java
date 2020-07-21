/*
Солдат хочет купить w бананов в магазине. Ему надо заплатить k долларов за первый банан, 2k долларов — за второй и
так далее (иными словами, за i-й банан надо заплатить i·k долларов).
У него есть n долларов. Сколько долларов ему придется одолжить у однополчанина, чтобы купить w бананов?
*/
import java.util.Scanner;

public class Soldier {
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
