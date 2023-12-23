import java.util.Scanner;

public class InsertionSort {

  public static void swap(int arr[], int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  public int[] sort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i <=n - 1; i++) {
      int j = i;
      while (j > 0 && arr[j - 1] > arr[j]) {
        swap(arr, j - 1, j);
        j--;
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
    InsertionSort obj = new InsertionSort();
    obj.sort(arr);
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
