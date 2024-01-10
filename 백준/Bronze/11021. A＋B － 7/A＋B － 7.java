import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String testCount = br.readLine();
        int count = Integer.parseInt(testCount);

        for (int i = 0; i < count; i++) {
            String input = br.readLine();
            String[] splitInput = input.split(" ");
            int a = Integer.parseInt(splitInput[0]);
            int b = Integer.parseInt(splitInput[1]);

            bw.write("Case #"+(i+1)+": "+(a+b)+"\n");
        }
        bw.flush();
    }
}
