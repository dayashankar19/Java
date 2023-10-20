import java.util.Scanner;

public class BubbleSort {

  public static void swap(int arr[], int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  public int[] sort(int arr[]) {
    int n = arr.length;
    for (int i = n - 1; i >= 1; i--) {
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
        }
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    BubbleSort obj = new BubbleSort();
    obj.sort(arr);
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
