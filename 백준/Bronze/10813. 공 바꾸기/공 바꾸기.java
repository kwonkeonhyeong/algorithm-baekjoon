import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        String N = NM[0];
        String M = NM[1];

        String store = "";
        String[] result = new String[Integer.parseInt(N)];
        for (int i = 0; i < Integer.parseInt(N); i++) {
            result[i] = i+1+"";
        }

        for (int i = 0; i < Integer.parseInt(M); i++) {
            String[] in = br.readLine().split(" ");
            String target1 = in[0];
            String target2 = in[1];
            store = result[Integer.parseInt(target1)-1];
            result[Integer.parseInt(target1)-1] = result[Integer.parseInt(target2)-1];
            result[Integer.parseInt(target2)-1] = store;
        }

        for (String s : result) {
            System.out.print(s+" ");
        }
    }
}
