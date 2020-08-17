/*
    Разработать расширение для своего любимого браузера, которое меняет регистр букв в каждом слове так, чтобы оно либо
    состояло только из маленьких букв, либо, наоборот, только из больших. При этом в слове должно измениться как можно
    меньше букв. Например, слово HoUse должно замениться на house, а слово ViP — на VIP. В случае, если в слове содержится
    одинаковое количество маленьких и больших букв, нужно заменить все буквы на маленькие. Например, maTRIx нужно заменить на matrix.
*/
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String resultWord;
        int lowerCase, upperCase;
        lowerCase = upperCase = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c)) ++lowerCase;
            else ++upperCase;
        }

        if (lowerCase >= upperCase) resultWord = word.toLowerCase();
        else resultWord = word.toUpperCase();

        System.out.println(resultWord);
    }
}
