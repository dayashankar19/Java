import java.util.Scanner;

public class SelectionSort {

  public static void swap(int arr[], int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  public int[] sort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      swap(arr, i, min);
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
    SelectionSort obj = new SelectionSort();
    obj.sort(arr);
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
