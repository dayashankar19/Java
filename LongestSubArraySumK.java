import java.util.Scanner;

public class LongestSubArraySumK {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the K value");
    int k = sc.nextInt();
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int longest = 0;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum = sum + arr[j];
        if (sum == k) {
          longest = Math.max(longest, j - i + 1);
        }
      }
    }
    System.out.println(longest);
  }
}
