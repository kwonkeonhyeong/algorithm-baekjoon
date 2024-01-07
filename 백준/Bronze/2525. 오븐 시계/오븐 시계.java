import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> time = List.of(input.split(" "));

        int nowHour = Integer.parseInt(time.get(0));
        int nowMinute = Integer.parseInt(time.get(1));

        int cookMinute = scanner.nextInt();

        int totalMinute = (nowHour * 60) + nowMinute + cookMinute;

        int finishHour = totalMinute/60;
        int finishMinute = totalMinute - (finishHour * 60);

        if (finishHour >= 24) {
            finishHour -= 24;
        }

        System.out.println(finishHour + " " + finishMinute);
    }
}