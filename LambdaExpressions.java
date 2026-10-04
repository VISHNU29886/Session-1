import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

public class Solution {

    public static PerformOperation isOdd() {
        return (a) -> a % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return (a) -> {
            if (a < 2) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }

            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return (a) -> {
            int original = a;
            int reverse = 0;

            while (a > 0) {
                int digit = a % 10;
                reverse = reverse * 10 + digit;
                a = a / 10;
            }

            return original == reverse;
        };
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int condition = sc.nextInt();
            int number = sc.nextInt();

            PerformOperation operation;

            if (condition == 1) {
                operation = isOdd();

                if (operation.check(number)) {
                    System.out.println("ODD");
                } else {
                    System.out.println("EVEN");
                }

            } else if (condition == 2) {
                operation = isPrime();

                if (operation.check(number)) {
                    System.out.println("PRIME");
                } else {
                    System.out.println("COMPOSITE");
                }

            } else {
                operation = isPalindrome();

                if (operation.check(number)) {
                    System.out.println("PALINDROME");
                } else {
                    System.out.println("NOT PALINDROME");
                }
            }
        }

        sc.close();
    }
}
