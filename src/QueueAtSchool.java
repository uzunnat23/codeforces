/*
    Пусть позиции в очереди последовательно пронумерованы целыми числами от 1 до n, причем тот, кто стоит на позиции
    номер 1 обслуживается первым. Тогда, если в момент времени x на i-ой позиции стоит мальчик, а на (i + 1)-ой — девочка,
    то в момент времени x + 1 на i-ой позиции будет находиться девочка, а на (i + 1)-ой — мальчик. Моменты времени заданы в секундах.
    Вам задано расположение ребят в начальный момент времени, определите, как будет выглядеть очередь через t секунд.
*/
import java.util.Scanner;

public class QueueAtSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPupil = scanner.nextInt();
        int time = scanner.nextInt();
        scanner.nextLine();
        String queue = scanner.nextLine();
        char[] queueArr = queue.toCharArray();

        while (time != 0) {
            for (int i = 1; i < countOfPupil; i++) {
                if (queueArr[i - 1] == 'B' && queueArr[i] == 'G') {
                    char temp = queueArr[i - 1];
                    queueArr[i - 1] = queueArr[i];
                    queueArr[i] = temp;
                    i++;
                }
            }
            time--;
        }

        for (int i = 0; i < queue.length(); i++) {
            System.out.print(queueArr[i]);
        }
    }
}
