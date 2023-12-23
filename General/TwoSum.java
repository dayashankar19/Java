import java.util.Scanner;

public class TwoSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter target:");
    int target = sc.nextInt();
    int size = sc.nextInt();
    boolean flag = false;
    int nums[] = new int[size];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] == target - nums[i]) {
          flag = true;
          System.out.println("[" + i + "," + j + "]");
          return;
        }
      }
    }
    if (!flag) {
      System.out.println("null");
    }
  }
}
