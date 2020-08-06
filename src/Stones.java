/*
    На столе в ряд выложены n камней, каждый из которых может быть красного, зеленого или синего цвета. Посчитайте,
    какое минимальное количество камней нужно убрать со стола, чтобы любые два соседних камня имели разные цвета.
    Камни в ряду считаются соседними, если между ними нет других камней.
*/
import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        int k = 0;
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            char s = str.charAt(i - 1);
            if (c == s) {
                k++;
            }
        }
        System.out.println(k);
    }
}
