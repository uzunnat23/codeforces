/*
    Капитализация — это запись слова, в которой первая буква слова записывается как прописная буква. Ваша задача, вывести
    капитализацию заданного слова.
    Обратите внимание, что в капитализации все буквы слова кроме первой остаются не измененными.
*/
import java.util.Scanner;

public class CapitalizationOfTheWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String f = s.substring(0, 1);
        String first = f.toUpperCase();

        if (s.length() > 1) {
            System.out.println(first + s.substring(1));
        } else System.out.println(first);
    }
}
