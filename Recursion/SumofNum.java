import java.util.Scanner;

public class SumofNum {

  public static int sums(int n) {
    if (n == 0) {
      return 0;
    }
    return n + sums(n - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(sums(n));
  }
}
