import java.util.Scanner;

public class TwoSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the target: ");
    int target = sc.nextInt();
    System.out.println("Enter array size:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    boolean pairFound = false;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] + arr[j] == target) {
          System.out.println("[" + i + "," + j + "]");
          pairFound = true;
        }
      }
    }
    if (!pairFound) {
      System.out.println("Not found");
    }
  }
}
