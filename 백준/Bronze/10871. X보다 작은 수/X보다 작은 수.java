import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NA = br.readLine().split(" ");
        String[] numbers = br.readLine().split(" ");

        List<String> result = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(NA[0]); i++) {

            if (Integer.parseInt(numbers[i]) < Integer.parseInt(NA[1])) {
                result.add(numbers[i]);
            }
        }

        for (String s : result) {
            System.out.print(s);
            System.out.print(" ");

        }
    }
}