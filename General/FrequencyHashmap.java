import java.util.HashMap;
import java.util.Scanner;

public class FrequencyHashmap {

  public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i : arr) {
      if (map.containsKey(i)) {
        map.put(i, map.get(i) + 1);
      } else {
        map.put(i, 1);
      }
    }
    for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println(
        "Number " + entry.getKey() + " Frequency " + entry.getValue()
      );
    }
  }
}
