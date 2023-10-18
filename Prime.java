import java.util.Scanner;

public class Prime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any num:");
    int n = sc.nextInt();
    boolean isPrime = true;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime == true) {
      System.out.println("Prime");
    } else {
      System.out.println("Not prime");
    }
  }
}
