import java.util.Scanner;

public class nTimes {

  public static void recursion(int n, int sum) {
    if (sum >= n) {
      return;
    }
    System.out.println(sum);
    recursion(n, sum + 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    recursion(n, sum);
  }
}
