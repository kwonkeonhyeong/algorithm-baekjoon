import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> time = List.of(input.split(" "));

        int hour = Integer.parseInt(time.get(0));
        int minute = Integer.parseInt(time.get(1));
        if ((minute - 45) < 0) {
            hour -= 1;
            minute = 60 + (minute - 45);
        } else if ((minute - 45) > 0) {
            minute = minute - 45;
        } else {
            minute = 0;
        }

        if (hour >= 24) {
            hour -= 24;
        } else if (hour < 0) {
            hour += 24;
        }

        System.out.println(hour + " " + minute);
    }
}