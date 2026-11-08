import java.util.Scanner;
public class Factorial {
    public int factorial1(int n) {
        // Factorial using recursion
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial1(n - 1);
        }
    }
    // Another Way Of Recursion
    public static int factorial2(int m) {
        if (m == 0 || m == 1) {
            return 1;

        } else {
            return (m) * factorial2(m - 1);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Factorial fc = new Factorial();
            System.out.println("Enter First Number");
            int x = sc.nextInt();
            System.out.println(fc.factorial1(x));
            System.out.println("Enter Second Number");
            int y = sc.nextInt();
            System.out.println(factorial2(y));
            // Factorial By Iterative Method
            System.out.println("Enter Third Number");
            int num = sc.nextInt();
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result = result * i;
            }
            System.out.println(result);
        }
    }
}
