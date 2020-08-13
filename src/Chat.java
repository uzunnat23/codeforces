/*
    Считается, что у Васи получилось поздороваться, если из напечатанного слова можно удалить некоторые буквы так,
    чтобы получилось слово "hello". Например, если Вася напечатал слово "ahhellllloou", считается, что он поздоровался,
    а если он напечатал "hlelo", считается, что Васю не поняли, и ему не удалось поздороваться. По заданному слову s
    определите, удалось ли Васе поздороваться.
*/
import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        /*int h = 0;
        int e = 0;
        int l1 = 0;
        int l2 = 0;
        int o = 0;*/
        boolean hOn1 = false;
        int h, e, l1, l2, o;
        h = e = l1 = l2 = o = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'h') {
                h = i;
                break;
            }
        }

        for (int i = h+1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'e') {
                e = i;
                break;
            }
        }

        for (int i = e+1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'l') {
                l1 = i;
                break;
            }
        }
        for (int i = l1+1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'l') {
                l2 = i;
                break;
            }
        }

        for (int i = l2+1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'o') {
                o = i;
                break;
            }
        }
        if (h < e && e < l1 && l1 < l2 && l2 < o)
            System.out.println("YES");
        else System.out.println("NO");

    }
}
