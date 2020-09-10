/*
    Юра и Леша хотят жить в одной комнате. Всего в общежитии есть n комнат. В данный момент в комнате с номером i живут
    pi человек, когда всего в этой комнате может жить q i человек (p i ≤ q i). Посчитайте, сколько комнат общежития смогут
    вместить Юру и Лешу вместе?
*/

import java.util.Scanner;

public class CheckIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfRooms = scanner.nextInt();
        int freeForChekingIn = 0;
        for (int i = 0; i < countOfRooms; i++) {
            int countOfMans = scanner.nextInt();
            int maxCount = scanner.nextInt();
            if (maxCount - countOfMans > 1) freeForChekingIn++;
        }
        System.out.println(freeForChekingIn);
    }
}
