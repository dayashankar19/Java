import java.util.HashSet;
import java.util.Scanner;

public class Duplicates {

  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      set.add(arr[i]);
    }
    int k = set.size();
    int temp[] = new int[k];
    int j = 0;
    for (int x : set) {
      temp[j] = x;
      j++;
    }
    for (int i = 0; i < k; i++) {
      System.out.print(temp[i]);
    }
  }
}
