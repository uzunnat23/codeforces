/*
    Перед Вами матрица размера 5 × 5, состоящая из 24-x нулей и единственной единицы. Строки матрицы пронумеруем числами от
    1 до 5 сверху вниз, столбцы матрицы пронумеруем числами от 1 до 5 слева направо. За один ход разрешается применить к
    матрице одно из двух следующих преобразований:
    Поменять местами две соседние строки матрицы, то есть строки с номерами i и i + 1 для некоторого целого i (1 ≤ i < 5).
    Поменять местами два соседних столбца матрицы, то есть столбцы с номерами j и j + 1 для некоторого целого j (1 ≤ j < 5).
    Вы считаете, что матрица будет выглядеть красиво, если единственная единица этой матрицы будет находиться в ее центре
    (в клетке, которая находится на пересечении третьей строки и третьего столбца). Посчитайте, какое минимальное количество
    ходов потребуется, чтобы сделать матрицу красивой.
*/

import java.util.Scanner;

public class CoolMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int k = 0;

/*
       The first way:

       int[][] a;
        a = new int[5][5];
        int t;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                t = scanner.nextInt();
                if (t == 1) {
                    n = (i < 2) ? 2 - i : i - 2;
                    k = (j < 2) ? 2 - j : j - 2;
                }
            }
        }
      System.out.println(k + n);
*/

/*
        The Second way:
        final int SIZE = 5;
        final int CENTER = 3;
        for (int i = 1; i <= SIZE; i++)
            for (int j = 1; j <= SIZE; j++)
                if (scanner.nextInt() == 1) {
                    System.out.println(Math.abs(i-CENTER) + Math.abs(j-CENTER));
                    return;
                }
*/
//      The third way:

        final int CENTER = 3;
        int absPosition = 1;
        while (scanner.nextInt() != 1) absPosition++;
        int i = (absPosition / 5);
        int j = (absPosition % 5);
        System.out.println((Math.abs(i - CENTER) + Math.abs(j - CENTER))-1);
    }
}

