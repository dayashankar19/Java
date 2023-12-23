import java.util.Scanner;

public class LongestPrimeFactor {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();

        int longestPrimeFactor = 0;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && isPrime(i)) {
                longestPrimeFactor = i;
            }
        }

        System.out.println("The longest prime factor is: " + longestPrimeFactor);
    }
}
