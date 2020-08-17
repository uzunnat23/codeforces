/*
    Слоник решил сходить в гости к другу. Оказалось, что дом слоника находится в точке 0, а дом его друга в точке x(x > 0)
    координатной прямой. За один шаг слоник может переместиться на 1, 2, 3, 4 или 5 позиций вперёд. Помогите ему определить,
    за какое минимальное количество шагов он может добраться до дома друга.
*/
import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int countOfSteps = 0;

        if (distance >= 5) {
            countOfSteps += distance / 5;
            distance  %= 5;
        }
        if (distance >= 4) {
            countOfSteps += distance / 4;
            distance %= 4;
        }
        if (distance >= 3) {
            countOfSteps += distance / 3;
            distance %= 3;
        }
        if (distance >= 2) {
            countOfSteps += distance / 2;
            distance %= 2;
        }
        if (distance == 1) {
            ++countOfSteps;
        }

        System.out.println(countOfSteps);
    }

}

