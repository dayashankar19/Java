import java.util.Scanner;

public class SecSmallest {

  int secondSmallest(int arr[], int n) {
    int smallest = arr[0];
    int Ssmallest = Integer.MAX_VALUE;
    for (int i = 1; i < n; i++) {
      if (arr[i] < smallest) {
        Ssmallest = smallest;
        smallest = arr[i];
      } else if (arr[i] < Ssmallest && arr[i] != smallest) {
        Ssmallest = arr[i];
      }
    }
    return Ssmallest;
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
    SecSmallest obj = new SecSmallest();
    System.out.println(obj.secondSmallest(arr, n));
  }
}
