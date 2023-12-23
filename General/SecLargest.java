import java.util.Scanner;

public class SecLargest {

  int secondLargest(int arr[], int n) {
    int largest = arr[0];
    int slargest = -1;
    for (int i = 1; i < n; i++) {
      if (arr[i] > largest) {
        slargest = largest;
        largest = arr[i];
      } else if (arr[i] < largest && arr[i] > slargest) {
        slargest = arr[i];
      }
    }
    return slargest;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array element:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    SecLargest obj = new SecLargest();
    System.out.println(obj.secondLargest(arr, n));
  }
}
