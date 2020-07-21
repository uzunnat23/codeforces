/*
Петя хочет сравнить эти строки лексикографически.При этом регистр букв значения не имеет,то есть большая буква
считается эквивалентной соответствующей маленькой букве.Помогите Пете выполнить сравнение.
Если первая строка меньше второй, выведите «-1». Если вторая строка меньше первой, выведите «1». Если строки
равны, выведите «0». Учтите, что регистр букв не учитывается при сравнении.
*/
import java.util.Scanner;

public class LexicographicOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s = s1.toLowerCase();
        String n = s2.toLowerCase();
        if (s.equals(n))
            System.out.println(0);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char b = n.charAt(i);
            if (c == b) continue;
            else if (c > b) {
                System.out.println(1);
                break;
            } else System.out.println(-1); break;
        }

    }
}


