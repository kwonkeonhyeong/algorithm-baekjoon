import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 1;
        int maxIndex = 0;

        for (int i = 0; i < 9; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number >= max) {
                max = number;
                maxIndex = i+1;
            }

        }
        System.out.println(max + " " + maxIndex);
    }
}
