import java.util.Scanner;

public class RearrangeArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nums[] = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    int nums1[] = new int[n / 2];
    int nums2[] = new int[n / 2];
    int nums3[] = new int[n];
    int a = 0, b = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] >= 0) {
        nums1[a++] = nums[i];
      } else {
        nums2[b++] = nums[i];
      }
    }
    int c = 0, d = 0, y = 0;
    while (c < a && d < b) {
      nums3[y++] = nums1[c++];
      nums3[y++] = nums2[d++];
    }
    System.out.println("Rearranged numsay:");
    for (int k = 0; k < n; k++) {
      System.out.println(nums3[k]);
    }
  }
}
