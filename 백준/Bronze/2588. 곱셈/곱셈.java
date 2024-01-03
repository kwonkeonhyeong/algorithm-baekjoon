import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int convertA = Integer.parseInt(a);
        int convertB = Integer.parseInt(b);

        List<String> bb = List.of(b.split(""));
        for (int i = 0; i < bb.size(); i++) {
            String current = bb.get(bb.size() - 1 - i);
            System.out.println(convertA * Integer.parseInt(current));
        }

        System.out.println(convertA * convertB);
    }
}