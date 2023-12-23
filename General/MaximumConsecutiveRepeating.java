//Program to check the maximum consecutive repeating character in a string
import java.util.Scanner;

public class MaximumConsecutiveRepeating {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any string:");
    String s = sc.nextLine();
    int len = s.length();
    int count = 1;
    int maxCount = 1;
    char pointer = s.charAt(0);
    for (int i = 1; i < len; i++) {
      if (s.charAt(i) == pointer) {
        count++;
        maxCount = Math.max(maxCount, count);
      } else {
        count = 1;
        pointer = s.charAt(i);
      }
    }
    System.out.println(maxCount);
  }
}
