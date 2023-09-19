import java.util.Scanner;

public class Kadane {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int max = 0, sum = 0;
    for (int i = 0; i < n; i++) {
      sum = sum + arr[i];
      if (max < sum) {
        max = sum;
      }
      if (sum < 0) {
        sum = 0;
      }
    }
    System.out.println(max);
  }
}
