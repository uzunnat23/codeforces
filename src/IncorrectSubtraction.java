/*
    Маленькая девочка Таня учится уменьшать числа на единицу, но она делает это неправильно с числами, состоящими из
    нескольких цифр. Таня вычитает единицу из числа по следующему алгоритму:
        -если последняя цифра числа не равна нулю, она уменьшает число на единицу;
        -если последняя цифра числа равна нулю, она делит число на 10 (то есть удаляет его последнюю цифру).
    Вам задано целое число n. Таня хочет вычесть из него единицу k раз. Ваша задача вывести результат после всех k вычитаний.
*/
import java.util.Scanner;

public class IncorrectSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minuend = scanner.nextInt();
        int countOfSubtractions = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < countOfSubtractions; i++) {
            if (minuend % 10 == 0) {
                result = minuend /= 10;
            } else result = --minuend;
        }
        System.out.println(result);
    }
}
