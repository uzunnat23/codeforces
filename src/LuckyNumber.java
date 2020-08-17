/*
    Петя любит счастливые числа. Всем известно, что счастливыми являются положительные целые числа, в десятичной записи
    которых содержатся только счастливые цифры 4 и 7. Например, числа 47, 744, 4 являются счастливыми, а 5, 17, 467 — не являются.
    К сожалению, не все числа счастливые. Петя называет число почти счастливым, если количество счастливых цифр в нем —
    счастливое число. Ему интересно, является ли число n почти счастливым.
*/
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringNumer = scanner.nextLine();
        int countOfLuckyNumber = 0;

        for (int i = 0; i < stringNumer.length(); i++) {
            char c = stringNumer.charAt(i);
            if (c == '4' || c == '7') ++countOfLuckyNumber;

        }

        String stringOfCount = Integer.toString(countOfLuckyNumber);

        for (int i = 0; i < stringOfCount.length(); i++) {
            char c = stringOfCount.charAt(i);
            if (c != '4' && c != '7') {
                System.out.println("NO");
                break;
            } else if (i == stringOfCount.length() - 1 && c == '4' || c == '7') {
                System.out.println("YES");
            }
        }
    }
}
