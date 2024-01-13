import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");

        int max = -1000000;
        int min = 1000000;

        for (String s : numbers) {
            int targetNumber = Integer.parseInt(s);
                max = Math.max(max,targetNumber);
                min = Math.min(min,targetNumber);
        }

        System.out.println(min + " " + max);
    }
}