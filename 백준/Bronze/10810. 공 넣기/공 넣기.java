import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        String[] a = new String[N];
        Arrays.fill(a, "0");

        for (int i = 0; i < M; i++) {
            String[] in = br.readLine().split(" ");
            int start = Integer.parseInt(in[0]);
            int end = Integer.parseInt(in[1]);
            int number = Integer.parseInt(in[2]);

            for (int j = start-1; j <  end; j++) {
                    a[j] = number+"";
            }
        }
        for (String s : a) {
            System.out.print(s+ " ");
        };
    }
}
