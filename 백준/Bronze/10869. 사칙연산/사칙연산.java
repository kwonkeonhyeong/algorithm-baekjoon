import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.println(calculationSum(a,b));
        System.out.println(calculationSubtract(a,b));
        System.out.println(calculationMultiply(a,b));
        System.out.println(calculationDivide(a,b));
        System.out.println(calculationRemainder(a,b));
    }

    public static long calculationSum(long a, long b) {
        return a + b;
    }

    public static long calculationSubtract(long a, long b) {
        return a - b;
    }

    public static long calculationMultiply(long a, long b) {
        return a * b;
    }

    public static long calculationDivide(long a, long b) {
        return a / b;
    }

    public static long calculationRemainder(long a, long b) {
        return a % b;
    }
}