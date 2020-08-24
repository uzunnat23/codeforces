import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        char q, w, e, r;
        q = w = e = r = 0;

        while (q == w || q == e || q == r || w == e || w == r || e == r) {
            String yearStr = Integer.toString(year+1);
            q = yearStr.charAt(0);
            w = yearStr.charAt(1);
            e = yearStr.charAt(2);
            r = yearStr.charAt(3);
            year++;
        }
        System.out.println(year);
    }
}
