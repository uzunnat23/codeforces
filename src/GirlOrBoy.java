/*
    Если количество различных символов в имени пользователя нечетное, тогда пользователь мужского пола, иначе — женского.
    Вам дана строка, обозначающая имя пользователя, помогите нашему герою определить по ней пол пользователя по описанному методу.
    Если пользователь оказался женского пола по методу нашего героя, выведите «CHAT WITH HER!» , иначе, выведите «IGNORE HIM!»
*/

import java.util.Scanner;

public class GirlOrBoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] strArr = str.toCharArray();
        int k = 0;
//The firs way
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (strArr[i] == strArr[j]) {
                    k++;
                    break;
                }
            }
        }

        if ((str.length() - k) % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else System.out.println("IGNORE HIM!");

/*
    The second way

    String str = scanner.nextLine();
    int diffCharCounter = 0;
    char[] chars = new char[256];
        for (char curChar : str.toCharArray())
                chars[curChar]++;

                for (int i = 0; i < 256; i++)
        if (chars[i] != 0) diffCharCounter++;

        if ((diffCharCounter) % 2 == 0)
        System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
*/

    }
}


