/*
    HQ9+ — шуточный язык программирования, состоящий всего из четырех односимвольных команд:
        -«H» печатает «Hello, World!»,
        -«Q» печатает исходный код самой программы,
        -«9» печатает текст песни «99 бутылок пива»,
        -«+» увеличивает на единицу значение внутреннего счетчика.
    Команды «H» и «Q» воспринимаются только в верхнем регистре. Все символы программы, не являющиеся командами, игнорируются.
    Вам дана программа на HQ9+. Определите, будет ли что-то напечатано в результате ее выполнения.
*/

import java.util.Scanner;

public class HQ9Plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String program = scanner.nextLine();
        boolean isHQ9Plus = false;

//        for (char c : program.toCharArray())
//            if (c == 'H' || c == 'Q' || c == '9') {
//                isHQ9Plus = true;
//                break;
//            }

        for (int i = 0; i < program.length(); i++) {
            char c = program.charAt(i);
            if (c == 'H' || c == 'Q' || c == '9') {
                isHQ9Plus = true;
                break;
            }
        }

        if (isHQ9Plus) System.out.println("YES");
        else System.out.println("NO");
    }
}

