import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            A.add(n);
        }

        List<Integer> B = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int m = scanner.nextInt();
            B.add(m);
        }

        //logic
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while(i < N && j < M) {
            int a = A.get(i);
            int b = B.get(j);

            if (a <= b) {
                result.add(a);
                i++;
            } else {
                result.add(b);
                j++;
            }
        }

        for(; i < N; i++) {
            result.add(A.get(i));
        }

        for(; j < M; j++) {
            result.add(B.get(j));
        }

        StringBuilder sb = new StringBuilder();
        for (int e : result) {
            sb.append(e + " ");
        }
        System.out.println(sb.toString());
    }
}
