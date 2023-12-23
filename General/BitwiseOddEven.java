import java.util.Scanner;

public class BitwiseOddEven {

  public void XOR(int num) {
    if ((num ^ 1) == num + 1) {
      System.out.println("Even");
    } else System.out.println("Odd");
  }

  public void AND(int num) {
    if ((num & 1) == 0) {
      System.out.println("Even");
    } else System.out.println("Odd");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num to check odd or even: ");
    int num = sc.nextInt();
    BitwiseOddEven obj = new BitwiseOddEven();
    System.out.println(" - Using XOR");
    obj.XOR(num);
    System.out.println(" - Using AND");
    obj.AND(num);
  }
}
