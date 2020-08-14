/*
    Вы решили поступить следующим образом: выбрать себе некоторое подмножество монет, так чтобы сумма достоинств взятых
    Вами монет оказалась строго больше, чем сумма достоинств оставшейся части монет, которая достанется Вашему близнецу.
    Однако, Вы справедливо решили, что если взять слишком много монет, то Ваш близнец подумает, что Вы его обманули.
    Поэтому, чтобы не вызывать подозрений, Вы решили взять наименьшее количество монет, сумма достоинств которых
    окажется строго больше суммы достоинств оставшихся. Исходя из этого, выясните, какое минимальное количество монет
    Вам понадобится взять, чтобы разделить их описанным образом.
*/
import java.util.Arrays;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxCountOfCoins = scanner.nextInt();
        int[] coinsArr;
        coinsArr = new int[maxCountOfCoins];
        int n = 0;
        int sumCoins, mySum;
        sumCoins  = mySum =  0;

        for (int i = 0; i < maxCountOfCoins; i++) {
            coinsArr[i] = scanner.nextInt();
            sumCoins += coinsArr[i];
        }

        Arrays.sort(coinsArr);

        for (int i = maxCountOfCoins - 1; i >= 0; i--) {
            mySum += coinsArr[i];
            ++n;
            if (mySum > sumCoins / 2) {
                break;
            }
        }
        System.out.println(n);
    }
}
