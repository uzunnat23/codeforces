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
            boolean b;
            b = Character.isLowerCase(c);
            if (b) ++lowerCase;
            else ++upperCase;
        }
        if (lowerCase >= upperCase) resultWord = word.toLowerCase();
        else resultWord = word.toUpperCase();
        System.out.println(resultWord);
    }
}
