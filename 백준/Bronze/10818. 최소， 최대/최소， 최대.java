import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] number = br.readLine().split(" ");
        String[] numbers = br.readLine().split(" ");

        int max = -1000000;
        int min = 1000000;

        for (String s : numbers) {
            int targetNumber = Integer.parseInt(s);
            if (targetNumber >= max) {
                max = targetNumber;
            }
            if (targetNumber <= min) {
                min = targetNumber;
            }
        }

        System.out.println(min + " " + max);
    }
}