import java.util.Scanner;

public class CheckIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfRooms = scanner.nextInt();
        int freeForChekingIn=0;
        for (int i = 0; i < countOfRooms; i++) {
            int countOfMans = scanner.nextInt();
            int maxCount = scanner.nextInt();
            if (maxCount - countOfMans > 1)freeForChekingIn++;
        }
        System.out.println(freeForChekingIn);
    }
}
