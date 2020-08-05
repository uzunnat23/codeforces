/*
    Учитель записал на доске сумму нескольких чисел, которую требуется посчитать. Чтобы было проще считать, в сумме
    используются только числа 1, 2 и 3. Но и этого Ксении мало. Ксения только учится считать, и поэтому она может посчитать
    сумму, только если слагаемые в сумме идут в порядке неубывания. Например, сумму 1+3+2+1 она посчитать не может,
    а суммы 1+1+2 и 3+3 может.
    Вам задана сумма, которая записана на доске. Переставьте слагаемые и выведите ее в виде, в котором Ксения сможет
    посчитать сумму.
*/
import java.util.Scanner;

public class SimpleAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;
        String s1 = "1+";
        String s2 = "2+";
        String s3 = "3+";
        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i);
            if (c == '1') ++l1;
            if (c == '2') ++l2;
            if (c == '3') ++l3;
        }
        String repeated = s1.repeat(l1) + s2.repeat(l2) + s3.repeat(l3);
        System.out.print(repeated.substring(0, repeated.length() - 1));


    }
}
