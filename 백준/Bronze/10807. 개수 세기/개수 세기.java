import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        int targetNumber = Integer.parseInt(br.readLine());

        int count = 0;

        for (String number : numbers) {
            if (Integer.parseInt(number) == targetNumber) {
                count++;
            }
        }

        System.out.println(count);
    }
}