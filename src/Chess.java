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
