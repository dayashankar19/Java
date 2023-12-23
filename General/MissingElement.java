import java.util.Scanner;

public class MissingElement {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n - 1; i++) {
      arr[i] = sc.nextInt();
    }
    int sum = 0;
    int totalSum = (n * (n + 1)) / 2;
    for (int i = 0; i < n - 1; i++) {
      sum = sum + arr[i];
    }
    int missing = totalSum - sum;
    System.out.println("Missing Element: " + missing);
  }
}
