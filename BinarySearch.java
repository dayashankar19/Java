import java.util.Scanner;

public class BinarySearch {

  void binSearch(int arr[], int l, int r, int key) {
    int mid;
    if (l == r) {
      if (arr[l] == key) {
        System.out.println("Element is present in index" + l);
      } else {
        System.out.println("Element not found");
      }
    } else {
      mid = (l + r) / 2;
      if (key == arr[mid]) {
        System.out.println("Element is present in index" + mid);
      } else if (key < arr[mid]) {
        binSearch(arr, l, mid, key);
      } else {
        binSearch(arr, mid + 1, r, key);
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    int l = 0, r = arr.length;
    System.out.println("Enter the array elements :");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the element to search: ");
    int key = sc.nextInt();
    BinarySearch obj = new BinarySearch();
    obj.binSearch(arr, l, r, key);
  }
}
