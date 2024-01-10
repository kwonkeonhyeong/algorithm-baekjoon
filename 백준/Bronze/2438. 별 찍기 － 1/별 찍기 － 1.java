import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int line = Integer.parseInt(input);
        int star = 1;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                sb.append("*");
            }
            sb.append("\n");
            star++;
        }
        bw.write(sb.toString());
        bw.flush();
    }
}