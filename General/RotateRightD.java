import java.util.Scanner;

public class RotateRightD {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter D value:");
    int d = sc.nextInt();
    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }



    for (int i = n-1; i >= 0; i--) {
      System.out.print(arr[i]);
    }

    for(int i=n-1;i>=n-d-1)

  }
}
