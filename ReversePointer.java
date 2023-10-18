import java.util.Scanner;

public class ReversePointer {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int a = 0, b = n - 1;
    while (a < b) {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
      a++;
      b--;
    }
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
