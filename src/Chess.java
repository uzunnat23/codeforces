/*
    Однажды, Антон с Даником сыграли n партий подряд. Для каждой партии друзьям известно, кто в ней победил — Антон или
    Даник. При этом ни одна из партий не окончилась вничью.
    Антону стало интересно, кто же выиграл больше раз — он или Даник? Помогите Антону и определите это.
*/
import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOFGames = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        int anton, danik;
        anton = danik = 0;

        for (int i = 0; i < countOFGames; i++) {
            char c = str.charAt(i);
            if (c == 'A') anton++;
            if (c == 'D') danik++;
        }

        if (anton > danik) System.out.println("Anton");
        else if (anton < danik) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}
