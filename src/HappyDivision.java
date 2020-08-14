/*
    Счастливыми являются положительные целые числа, в десятичной записи которых содержатся только счастливые цифры 4 и 7.
    Например, числа 47, 744, 4 являются счастливыми, а 5, 17, 467 — не являются.
    Петя называет число почти счастливым, если оно делится без остатка на какое-либо счастливое число. Помогите ему
    узнать, является ли заданное число n почти счастливым?
*/
import java.util.Scanner;

public class HappyDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k = str.length();
        int strInteger = Integer.parseInt(str);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != '4' && c != '7') {
                k--;
                if (strInteger % 4 == 0 || strInteger % 7 == 0 ||
                    strInteger % 47 == 0 || strInteger % 74 == 0 || strInteger % 77 == 0 ||
                    strInteger % 444 == 0 || strInteger % 447 == 0 || strInteger % 477 == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                break;
            }
        }
        if (k == str.length()) System.out.println("YES");
    }
}
