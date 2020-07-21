/*
Будем считать слово слишком длинным, если его длина строго больше 10 символов. Все слишком длинные слова можно заменить
специальной аббревиатурой.
Эта аббревиатура строится следующим образом: записывается первая и последняя буква слова, а между ними — количество букв
между первой и последней буквой (в десятичной системе счисления и без ведущих нулей).
*/
import java.util.Scanner;

public class LongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            if (s.length() <= 10)
                System.out.println(s);
            else
                System.out.println(s.charAt(0) + Integer.toString(s.length() - 2) + s.charAt(s.length() - 1));
        }
    }
}
