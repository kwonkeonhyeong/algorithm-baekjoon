import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> splitInput = List.of(input.split(" "));

        int a = Integer.parseInt(splitInput.get(0));
        int b = Integer.parseInt(splitInput.get(1));

        if (a > b) {
            System.out.println(">");
        } else if (b > a) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}