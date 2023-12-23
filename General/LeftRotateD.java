import java.util.Scanner;

public class LeftRotateD {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter D value:");
    int d = sc.nextInt();
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int temp[] = new int[d];
    for (int i = 0; i < d; i++) {
      temp[i] = arr[i];
    }
    for (int i = d; i < n; i++) {
      arr[i - d] = arr[i];
    }
    int z = 0;
    for (int i = n - d; i < n; i++) {
      arr[i] = temp[z];
      z++;
    }
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]);
    }
  }
}
