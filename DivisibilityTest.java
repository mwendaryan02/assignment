import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner divisible = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = divisible.nextInt();

        System.out.println("Divisibility tests for " + number + ":");
        for (int i = 1; i <= 9; i++) {
            if (isDivisible(number, i)) {
                System.out.println("The number is divisible by " + i + " because it " + getReason(number, i));
            } else {
                System.out.println("The number is not divisible by " + i);
            }
        }
    }

    private static boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }

    private static String getReason(int number, int divisor) {
        int lastDigit = number % 10;
        if (divisor == 2) {
            return lastDigit % 2 == 0? "is even" : "is not even";
        } else if (divisor == 5) {
            return lastDigit == 0 || lastDigit == 5? "ends with a 0 or 5" : "does not end with a 0 or 5";
        } else {
            return "passes the divisibility test for " + divisor;
        }
    }
}