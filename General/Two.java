import java.util.Scanner;

public class Two {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size:");
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int store[] = new int[n];

    int sum = 0;
    for (int i = 0; i < n; i++) {
      int max = Integer.MIN_VALUE;
      for (int j = 0; j < n; j++) {
        if (arr[i][j] > max) {
          max = arr[i][j];
        }
      }
      store[i] = max;
    }
    for (int k = 0; k < store.length; k++) {
      sum = sum + store[k];
    }
    System.out.println(sum);
  }
}
