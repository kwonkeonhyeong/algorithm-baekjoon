import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spot1 = scanner.nextInt();
        int spot2 = scanner.nextInt();
        boolean position1 = false;
        boolean position2 = true;

        if (spot1 > 0) {
            position1 = true;
        }
        if (spot1 < 0) {
            position2 = false;
        }

        if (spot2 > 0) {
            position2 = true;
        }
        if (spot2 < 0) {
            position2 = false;
        }

        if (position1) {
            if(position2) {
                System.out.println("1");
            }
            if(!position2) {
                System.out.println("4");
            }
        }
        if (!position1) {
            if(position2) {
                System.out.println("2");
            }
            if(!position2) {
                System.out.println("3");
            }
        }
    }
}