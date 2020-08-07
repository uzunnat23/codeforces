/*
    Дано покоящееся тело в пространстве, и даны силы, действующие на него. Тело можно считать материальной точкой с
    координатами (0; 0; 0). Васе нужно было ответить, находится ли оно в равновесии.
*/

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int SumCoordinate1 = 0;
        int SumCoordinate2 = 0;
        int SumCoordinate3 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                int t = scanner.nextInt();

                if (j == 0) SumCoordinate1 += t;
                if (j == 1) SumCoordinate2 += t;
                if (j == 2) SumCoordinate3 += t;
            }
        }
        System.out.println((SumCoordinate1 == 0 && SumCoordinate2 == 0 && SumCoordinate3 == 0) ? "YES" : "NO");
    }
}

