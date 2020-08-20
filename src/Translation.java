/*
    Слово на бирляндском языке отличается от такого же по смыслу слова на берляндском только тем, что оно пишется
    (и произносится) наоборот. Например, слову code в берляндском языке соответствует слово edoc в бирляндском.
    Несмотря на это, при «переводе» легко ошибиться. Вася перевел слово s с берляндского на бирляндский как t.
    Помогите ему: определите, правильно ли он выполнил перевод?
*/
import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder word = new StringBuilder(scanner.nextLine());

     System.out.println((word.reverse().toString().equals(scanner.nextLine())?"YES":"NO"));
    }
}
