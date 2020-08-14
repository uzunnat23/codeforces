/*
    В Линейном Королевстве всего один трамвайный маршрут. На нем n остановок, пронумерованных от 1 до n в порядке
    следования трамвая. На i-ой остановке a i человек выходит из трамвая, а b i человек заходит в трамвай. Трамвай
    прибывает на первую остановку пустым. Также, когда трамвай прибывает на последнюю остановку, все пассажиры выходят,
    и трамвай уезжает пустым.
    Ваша задача — найти минимальную возможную вместимость трамвая, такую, что количество пассажиров в трамвае в любой
    момент времени не превосходит эту вместимость. Учтите, что на каждой остановке все пассажиры выходят до того как
    какой-либо пассажир заходит.
*/
import java.util.Scanner;

public class Trolley {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfStops = scanner.nextInt();
        int entered, became, maxPas;
        entered = became = maxPas = 0;
        scanner.nextLine();

        for (int i = 0; i < numOfStops; i++) {
            for (int j = 0; j < 2; j++) {
                int t = scanner.nextInt();

                if (j == 0) entered = t;
                if (j == 1) became += (entered - t);
                if (maxPas > became) maxPas = became;
            }
        }
        System.out.println(Math.abs(maxPas));
    }
}
