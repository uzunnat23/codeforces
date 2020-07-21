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


