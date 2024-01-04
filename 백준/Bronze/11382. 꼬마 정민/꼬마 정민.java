import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> splitInput = List.of(input.split(" "));

        Long result = 0L;

        for (String s : splitInput) {
            result += Long.parseLong(s);
        }

        System.out.println(result);
        }
}
