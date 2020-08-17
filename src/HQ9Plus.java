import java.util.Scanner;

public class HQ9Plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String program = scanner.nextLine();
        boolean isHQ9Plus = false;

        for (int i = 0; i < program.length(); i++) {
            char c = program.charAt(i);
            if (c == 'H' || c == 'Q' || c == '9') {
                isHQ9Plus = true;
                break;
            }
        }

        if (isHQ9Plus) System.out.println("YES");
        else System.out.println("NO");
    }
}

