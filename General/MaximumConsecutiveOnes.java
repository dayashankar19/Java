import java.util.Scanner;

public class MaximumConsecutiveOnes {

  public static void main(String[] args) {
    int i;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int currCount = 0, maxCount = 0;

    for (i = 0; i < n; i++) {
      if (arr[i] == 1) {
        currCount++;
        maxCount=Math.max(currCount,maxCount);
      }
      else{
        currCount=0;
      }
    }
    System.out.println(maxCount);
  }
}
