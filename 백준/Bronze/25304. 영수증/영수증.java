import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String totalPrice = br.readLine();
        int value = Integer.parseInt(totalPrice);

        String itemCount = br.readLine();
        int count = Integer.parseInt(itemCount);

        int sumPrice = 0;
        for (int i = 0; i < count; i++) {
            String order = br.readLine();
            String[] splitOrder = order.split(" ");
            sumPrice += (Integer.parseInt(splitOrder[0]) * Integer.parseInt(splitOrder[1]));
        }

        if (value == sumPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}