/*
    Петя записался в кружок по программированию. На первом занятии Пете задали написать простую программу. Программа
    должна делать следующее: в заданной строке, которая состоит из прописных и строчных латинских букв, она:
        удаляет все гласные буквы,
        перед каждой согласной буквой ставит символ ".",
        все прописные согласные буквы заменяет на строчные.
    Гласными буквами считаются буквы "A", "O", "Y", "E", "U", "I", а согласными — все остальные. На вход программе подается
    ровно одна строка, она должна вернуть результат в виде одной строки, получившейся после обработки.
*/

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder strBuff = new StringBuilder(scanner.nextLine().toLowerCase());

        for (int i = 0; i < strBuff.length(); i++) {
            char c = strBuff.charAt(i);
            if (c == 'a' || c == 'o' || c == 'y' || c == 'e' || c == 'u' || c == 'i') {
                strBuff.deleteCharAt(i);
                i--;
            }
        }

        for (int j = 0; j < strBuff.length(); j++)
            System.out.print("." + strBuff.charAt(j));
    }
}

