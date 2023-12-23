import java.util.HashMap;
import java.util.Scanner;

public class NumberAppearOnce {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    int n = sc.nextInt();
    int arr[] = new int[n];
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt(); // Read values into the array
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }

    for (int key : map.keySet()) {
      if (map.get(key) == 1) {
        ans = key;
        break; // No need to continue searching once we find the element that appears only once
      }
    }

    System.out.println(ans);
  }
}
