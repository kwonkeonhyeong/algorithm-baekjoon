import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        long value = Long.parseLong(input);

        long result = 0;
        for (long i = 0; i < value; i++) {
            result += i+1;
        }

        System.out.println(result);
    }
}