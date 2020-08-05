/*
    Петя очень любит футбол. Однажды, глядя футбольный матч, он записывал на листе бумаги текущее положение игроков.
    Для простоты он изобразил ситуацию в виде строки из нулей и единиц. Ноль соответствует игрокам одной команды,
    единица — игрокам другой команды. Если есть как минимум 7 игроков некоторой команды, стоящих подряд, то эта ситуация
    считается опасной. Например, ситуация 00100110111111101 — опасная, а 11110111011101 — нет. Вам задана текущая ситуация.
    Определите, является ли она опасной.
*/
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int FirsCommand = s.lastIndexOf("1111111");
        int SecondCommand = s.lastIndexOf("0000000");

        if (FirsCommand == -1 && SecondCommand == -1) {
            System.out.println("NO");
        } else {
            System.out.println("YES ");
        }

    }
}
// String FirsCommand ="1111111";
// String SecondCommand ="0000000";