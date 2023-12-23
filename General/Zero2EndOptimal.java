import java.util.Scanner;

public class Zero2EndOptimal {

  void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  public static void main(String[] args) {
    Zero2EndOptimal obj = new Zero2EndOptimal();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int j = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        j = i;
        break;
      }
    }
    for (int i = j + 1; i < n; i++) {
      if (arr[i] != 0) {
        obj.swap(arr, i, j);
        j++;
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
