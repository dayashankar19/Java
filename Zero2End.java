import java.util.ArrayList;
import java.util.Scanner;

public class Zero2End {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> li = new ArrayList<>(n);

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] != 0) {
        li.add(arr[i]);
      }
    }
    int size = li.size();
    for (int i = 0; i < size; i++) {
      arr[i] = li.get(i);
    }
    for (int i = size; i < n; i++) {
      arr[i] = 0;
    }
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
